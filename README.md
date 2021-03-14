# * 프로젝트 과정은 Wiki를 참고해 주세요!

<

## 1. 프로젝트 명 
> ARM 서버 기반의 클라우드 환경(opensatck, container--kubernetes)의 자동체온측정 데이터 모니터링 웹서비스

<br>

## 2. 프로젝트 목적 
> 1. 코로나19로 인해 시설 입장시, 수기 작성의 불편함을 해결할 수 있는 자동 체온관리 시스템 구축
> 2. 가상머신과 container 2가지 환경의 웹서비스 배포 성능 비교

<br>

## 3. 프로젝트 환경

### <openstack>
  
* WEB instance
<pre>
<code>
OS : ubuntu18.04
Openjdk 11
Spring boot 2.4.0
Gradle 6.6.1
network: 192.168.0.138/24
</code>
</pre>

<br>
  
* DB instance
<pre>
<code>
OS : ubuntu18.04
MariaDB 10.5
network: 192.168.0.150/24
</code>
</pre>

<br>
<br>

### <container -- kubernetes 사용>

* WEB pod
<pre>
<code>
OS : ubuntu18.04
Openjdk 11
Spring boot 2.4.0
Gradle 6.6.1
network: 192.168.0.51/24 (LB-external ip)
</code>
</pre>

<br>

* DB pod
<pre>
<code>
OS : ubuntu18.04
MariaDB 10.5
network: 192.168.0.50/24 (LB-external ip)
</code>
</pre>

<br>

## 4. DB table
![DB table](https://user-images.githubusercontent.com/46100398/96832592-f5100c00-1479-11eb-8964-d360ef6615fa.png)

<br>

## 5. 웹 서비스 페이지 기술 개발 내용
#### * 서비스 배포(openstack)
![deployment_on_the_vm](https://user-images.githubusercontent.com/46100398/99230191-5dac9780-2832-11eb-9a38-c79ff7548d3c.PNG)

<br>

#### * 서비스 배포(container with kubernetes)
![deployment_on_the_container](https://user-images.githubusercontent.com/46100398/99230263-7917a280-2832-11eb-9220-73db80a71afc.PNG)

<br>

#### * 화면별 세부기능
##### 1. index page
![index_page](https://camo.githubusercontent.com/8457092e5b0f3d23aeb0a6b195d6b229d7c92080bbd01194bd6070ce281692de/68747470733a2f2f706f737466696c65732e707374617469632e6e65742f4d6a41794d4441354d6a4e664d5445302f4d4441784e6a41774f4451304d6a67344e5467352e78756348506775644e5a344b6d3231584d56553468756a6b756b427478384a7536567944774d546b716659672e314b68625a503373395f42735848534138344d47317337387474524e6f78476a475074776355374b416d45672e504e472e3232796f7572735f2f696e646578506167652e706e673f747970653d77353830)

<br>

##### 2. login page
![login_page](https://camo.githubusercontent.com/2fbad2b6cbeadf534a19c85dbd81ed57c80830a09b7efc4f1a09dc645d0ba3a1/68747470733a2f2f706f737466696c65732e707374617469632e6e65742f4d6a41794d4441354d6a56664d54637a2f4d4441784e6a41784d4445344f5463794e5451352e4175594d4c63633672415846353071576d53627242435037493269376b6b68427a706a43726d5873597855672e49384a64596977396743667552685a7338336e6442306c4d764c665a335834586f6d307a4154426a6f694d672e504e472e3232796f7572735f2f6c6f67696e50616765332e706e673f747970653d77353830)

<br>

##### 3. main page --> 오늘 날짜 및 선택된 날짜의 체온 측정 데이터 List 
![main_page](https://user-images.githubusercontent.com/46100398/99233740-fd6c2480-2836-11eb-96ae-dead652ef1c5.png)

<pre>
<code>
 1. 날짜 선택 가능 --> default 는 오늘(today)
 2. 해당 멤버를 클릭하면 member Page 창이 뜨고, 인적 데이터 확인 가능
 3. 37도 이상 data는 빨간색(주의)으로 표시
</code>
</pre>

<br>

##### 4. member page
![member_page](https://user-images.githubusercontent.com/46100398/99233776-09f07d00-2837-11eb-9d66-41713feddb88.png)

<pre>
<code>
 1. 37도 이상 이었던 날짜와 시간, 장소 확인 가능
</code>
</pre>

<br>

## 6. 각 환경의 웹서비스 성능 비교
### * 쟁점1. jar파일 실행 직 후, 웹브라우저에서 서비스 접근 소요 시간
![compare1](https://user-images.githubusercontent.com/46100398/99234904-82a40900-2838-11eb-890f-970e446d0047.PNG)

<br>

### * 쟁점2 서비스가 가동된 이 후, 웹브라우저에서 서비스 접근 소요 시간. 
![compare2](https://user-images.githubusercontent.com/46100398/99234942-8c2d7100-2838-11eb-9b76-2adcfe5d045e.PNG)

<br>


## 7. 사용된 ARM 서버
### * openstack 
![openstack_server](https://user-images.githubusercontent.com/46100398/99251266-601dea00-2850-11eb-84e4-a23af267024b.PNG)

<br>

### * kubernetes
![k8s_server](https://user-images.githubusercontent.com/46100398/99251281-6744f800-2850-11eb-8543-95c1dfa600a6.PNG)
