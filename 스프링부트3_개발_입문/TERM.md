<details>
  <summary>JPA(Java Persistence API)</summary>
  자바 언어로 DB에 명령을 내리는 도구로, 데이터를 객체 지향적으로 관리할 수 있게 해 줍니다.
</details>
<br>
<details>
  <summary>DTO에 역할</summary>
폼 데이터에 실어 보낸 데이터는 서버의 컨트롤러가 객체에 담아 받는데, 이 객체를 DTO(Data Transfer Object)라고 합니다. DTO로 받은 데이터는 최종적으로 데이터베이스(DB, Database)에 저장됩니다.
</details>   
<br>
<details>
  <summary>DTO를 DB에 저장하는 과정</summary>
DTO를 엔티티로 변환한 후 리파지터리를 이용해 엔티티를 DB에 저장합니다
</details>   
<br>
<details>
  <summary>엔티티에 역할</summary>
  자바 객체를 DB가 이해할 수 있게 만든 것으로, 이를 기반으로 테이블이 만들어집니다.
</details>
<br>
<details>
  <summary>리포지토리에 역할</summary>
  엔티티가 DB 속 테이블에 저장 및 관리될 수 있게 하는 인터페이스입니다.
</details>
<br>
<details>
  <summary>toString()</summary>
  데이터를 잘 받았는지 확인
</details>
<br>

<details>
  <summary>의존성 주입 - @Autowired</summary>
외부에서 만들어진 객체를 필요한 곳으로 가져오는 기법을 의존성 주입(DI, Dependency Injection)이라고 합니다. 스프링 부트는 @Autowired 어노테이션으로 의존성 주입을 할 수 있습니다.
</details>
<br>

### 롬복

<details>
  <summary>롬복이란</summary>
  코드를 간소화해 주는 라이브러리이다.   
  개발하다 보면 getter(), setter(), constructor(), toString()과 같은 필수 메서드를 사용하기 마련인데요. 이를 매번 작성하는 것은 생각보다 번거롭습니다. 스마트하지만 게으른 개발자들은 이런 반복을 없애려 했고, 그래서 나온 도구가 바로 롬복입니다.   
  <br>
  @AllArgsConstructor, @ToString의 구현 방식에 대해 알아봐도 좋을 것 같다.
</details>
<br>
<details>
  <summary>@AllArgsConstructor</summary>

- 이 애너테이션은 클래스의 모든 필드를 인자로 하는 생성자를 생성합니다.
- 생성자를 수동으로 작성하는 번거로움을 줄여줍니다.

```java
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    // getters and setters
}

//사용했을때
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

</details>
<br>
<details>
  <summary>@NoArgsConstructor</summary>

- 파라미터가 없는 디폴트 생성자를 자동으로 생성한다. 
- 이 어노테이션을 사용하면, 클래스에 명시적으로 선언된 생성자가 없더라도 인스턴스를 생성할 수 있다.
```java
@NoArgsConstructor
    public class Person {
    private String name;
    private int age;
    // getters and setters
}
//NoArgsConstructor 사용하면 Java 코드는 다음과 같아진다.

public class Person {
private String name;
private int age;

	public Person(){}
}
```
</details>
<br>
<details>
  <summary>@PathVariable</summary>
  URL 요청으로 들어온 전달값을 컨트롤러의 매개변수로 가져오는 어노테이션입니다.
</details>
<br>
<details>
  <summary>Optional 사용방법</summary>
  Optional은 Java 8에서 도입된 유틸리티 클래스로, 객체의 존재 여부를 나타내는 컨테이너입니다. 
Optional을 사용하면 null을 직접 다루는 것보다 더 안전하게 코드를 작성할 수 있으며, NullPointerException을 피할 수 있습니다.
</details>
<br>
<details>
  <summary>Click to toggle</summary>
  This is the content that can be toggled. It will appear or disappear when you click on "Click to toggle".
</details>
<br>
<details>
  <summary>Click to toggle</summary>
  This is the content that can be toggled. It will appear or disappear when you click on "Click to toggle".
</details>
<br>
<details>
  <summary>Click to toggle</summary>
  This is the content that can be toggled. It will appear or disappear when you click on "Click to toggle".
</details>
<br>
<details>
  <summary>Click to toggle</summary>
  This is the content that can be toggled. It will appear or disappear when you click on "Click to toggle".
</details>
<br>
<details>
  <summary>Click to toggle</summary>
  This is the content that can be toggled. It will appear or disappear when you click on "Click to toggle".
</details>