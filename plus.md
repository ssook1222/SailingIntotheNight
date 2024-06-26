## 📝 기술적으로 고민했던 부분

### 📎 구현 플랫폼의 결정

스마트폰에서 구동되는 어플리케이션의 형태로 기획 단계의 내용을 구현하기 위해 어떤 플랫폼으로 앱을 개발할지 고민하였다.    

프로토타입의 경우 앱인벤터를 사용하여 구현하였으나, 용량이 10MB가 넘으면 개발을 할 수 없다는 점과 앱 다운로드가 QR 코드를 통해 이루어져 불편하다는 문제점이 있었다.          

따라서 앱 인벤터 대신 안드로이드 스튜디오 플랫폼에서 개발을 진행하기로 결정하여 해당 플랫폼에서 개발하였다.


---
### 📎 데이터의 세이브와 로드

사용자의 결정 및 진행 상황을 저장하기 위해 원격(서버) 데이터베이스 : 파이어베이스를 따로 둘지, 로컬 데이터베이스 : Sharedpreferences로 처리할 지 고민하였다.    
최종적으로는 별도 서버 연결 없이(데이터나 와이파이 없이) 바로 저장 서비스를 사용할 수 있게끔, 또 데이터베이스의 아키텍처가 복잡하지 않다는 점을 고려하여 sharedpreferences를 사용하였다.      

#### 📍 sharedpreferences

- 데이터 세이브 / 로드     
: 게임 진행상황 세이브 / 로드 기능의 경우 어플리케이션의 각 씬(자바 클래스)를 저장하여 불러오는 방식으로 구현하였다.
  
- 루트 분기점 저장
: binary 형태로 저장하였다. 특정 분기를 지나왔다면 해당 분기에서만 포인트가 되는 변수를 true로, 지나오지 않았다면 false로 저장하여 분기마다 해당 값을 비교할 수 있게끔 하였다.
  
---
### 어플리케이션의 용량 최적화

구글 플레이스토어에 앱을 올리기 위해서는 최대 150MB의 용량이 나와야 한다. 하지만 해당 앱의 경우 고화질의 이미지가 많이 사용되어 개발에 있어 용량 최적화가 큰 문제가 되었었다.       
리소스를 최소한으로 하기 위해 apk 형태가 아닌 **확장 파일(Android App Bundle)을 사용하여 출시를 진행**하였다.       
Android App bundle을 통해 APK 생성 및 Google Play 서명이 연기하여, 사용자는 앱 실행에 필요한 코드와 리소스만 담긴 최적화된 APK를 다운로드할 수 있게 된다.