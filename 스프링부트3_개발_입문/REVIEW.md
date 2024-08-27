<details>
  <summary>클래스, 객체, 생성자란</summary>

## 클래스 (Class)

객체를 정의한 설계도 또는 틀입니다. 객체의 상태를 나타내는 필드(변수)와 객체의 행동을 정의하는 메소드(함수)로 구성됩니다. 클래스는 정의하는 것은 어떤 새로운 데이터 타입을 만드는 것과 유사합니다.

### 예시

“자동차”를 나타내는 클래스를 만든다고 생각해보세요. 자동차는 브랜드, 모델, 색상 같은 속성(필드)과 주행, 정지 같은 행동(메소드)을 가질 수 있습니다.

```jsx
public class Car {
    // 필드
    String brand;
    String model;
    String color;

    // 메소드
    void drive() {
        System.out.println("차가 주행 중입니다.");
    }

    void stop() {
        System.out.println("차가 정지했습니다.");
    }
}
```

## 객체 (Object)

객체는 클래스를 기반하여 생성된 인스턴스입니다. 클래스의 정의를 바탕으로 객체를 생성하고, 이 객체를 통해 클래스에 정의된 메소드를 실행하거나 변수를 조작합니다.

### 예시

`Car` 클래스를 바탕으로 실제 자동차를 나타내는 객체를 만들어보겠습니다.

```jsx
Car myCar = new Car(); // Car 객체를 생성
myCar.brand = "Hyundai";
myCar.model = "Sonata";
myCar.color = "Black";

myCar.drive(); // "차가 주행 중입니다." 출력
myCar.stop(); // "차가 정지했습니다." 출력
```

## 생성자 (Constructor)

객체가 생성될 때 자동으로 호출되는 특별한 메소드입니다. 생성자는 객체의 초기 상태를 설정하는 데 사용됩니다. 클래스 이름과 동일하며 리턴 타입을 정의하지 않습니다.

### 예시

`Car` 클래스에 생성자를 추가해서 객체 생성 시 자동차의 브랜드, 모델, 색상을 초기화할 수 있도록 해보겠습니다.

```jsx
public class Car {
    String brand;
    String model;
    String color;

    // 생성자
    public Car(String brand, String model, String color) {
        this.brand = brand; // this 키워드는 현재 객체를 가리킵니다.
        this.model = model;
        this.color = color;
    }

    void drive() {
        System.out.println("차가 주행 중입니다.");
    }

    void stop() {
        System.out.println("차가 정지했습니다.");
    }
}

// 객체 생성 및 초기화
Car myCar = new Car("Hyundai", "Sonata", "Black");
myCar.drive();
myCar.stop();
```
</details>
<br>
<details>
  <summary>DTO와 Entity에 생성자(Constructor)를 만드는 이유</summary>
  모두 생성자를 통해 객체의 초기 상태를 설정하고, 객체 간 변환 및 데이터 전달을 보다 명확하게 관리할 수 있습니다.
   
**초기화가 필요한 이유**   
1. 안전한 시작: 객체를 만들 때 필요한 값들을 미리 설정해줘야, 나중에 이 객체를 사용할 때 문제가 안 생깁니다.
2. 예상된 동작: 객체가 항상 예측 가능한 상태로 존재하게 하려면, 처음에 필요한 값들을 넣어줘야 합니다.
3. 오류 방지: 초기화하지 않으면 null 같은 문제가 생겨 프로그램이 에러를 낼 수 있습니다.

**예시**
- 초기화 안 한 경우: 자동차에 시동을 걸려고 하는데, 엔진이 없는 것과 같습니다.
- 초기화 한 경우: 시동을 걸기 전에 엔진을 넣어둬서 문제가 생기지 않도록 하는 것과 같습니다.

</details>
<br>

### CRUD 정리

<details>
  <summary>최초 작성 순서(초기)</summary>
  이 방법은 실제 작업과 다르게 제가 이해하기 위해 작성했습니다. (POST 기준)

1. 어떤 페이지를 만들 것인지 컨트롤러에 작성한다.
2. 해당 화면에 들어가는 entity를 정의한다.
3. entity에 필요한 dto를 정의한다.
   4. DB에 접근하기 위해 dto를 엔티티로 변환하는 코드를 만든다. 
4. 데이터베이스 접근에 필요한 리포지토리를 정의한다.
5. 엔티티로 변환하고 그 값을 리포지토리를 통해 데이터를 저장한다.
</details>
<br>

<details>
  <summary>데이터 조회 과정</summary>

1. 사용자가 HTML에서 데이터를 조회해 달라고 요청한다.
2. 컨트롤러가 요청을 받아 해당 URL에서 찾으려는 정보를 리파지토리에 전달한다.
3. 리파지토리는 정보를 가지고 DB에 데이터 조회를 요청한다.
4. DB는 해당 데이터를 찾아 이를 엔티티로 반환한다.
5. 반환된 엔티티가 모델을 통해 뷰 템플릿으로 전달한다.
</details>
<br>
<details>
  <summary>데이터 조회 과정</summary>
  
1. id를 리포지토리에서 조회해 데이터 가져오기
2. 모델에 데이터 등록하기 
   3. 등록 이유: 데이터를 모델에 등록하는 이유는 MVC 패턴에 따라 조회한 데이터를 뷰 페이지에서 사용하기 위해서)
3. 뷰 페이지 반환하기
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