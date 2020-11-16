### 1. 프로젝트 명 
> ARM 서버 기반의 클라우드 환경(opensatck, container--kubernetes)의 자동체온측정 데이터 모니터링 웹서비스

<br>

### 2. 프로젝트 목적 
> 1. 코로나19 시점의 자동 체온관리 시스템을 위한 ARM 기반 Edge computing cloud service 구축
> 2. 가상머신과 container 2가지 환경의 웹서비스 배포 성능 비교

<br>

### 3. 프로젝트 환경

<br>

## <openstack>
  
* web instance
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
  
* db instance
<pre>
<code>
OS : ubuntu18.04
MariaDB 10.5
network: 192.168.0.150/24
</code>
</pre>

<br>
<br>

<container -- kubernetes사용>

* web pod
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

* db pod
<pre>
<code>
OS : ubuntu18.04
MariaDB 10.5
network: 192.168.0.50/24 (LB-external ip)
</code>
</pre>

<br>

#### 4. DB table
![DB table](https://user-images.githubusercontent.com/46100398/96832592-f5100c00-1479-11eb-8964-d360ef6615fa.png)
