### \[Q\] 자바의 특징

\[A\]
Java는 객체지향언어이기 때문에 캡슐화, 상속, 다형성, 추상화의 특징을 가집니다.
JVM을 이용하기 때문에 운영체제에 독립적이고 GC를 지원합니다.

<br>

### \[Q\] JAVA의 장단점

\[A\]
장점은 JVM(자바가상머신) 위에서 동작하기 때문에 운영체제에 독립적이고 GabageCollector를 통한 자동적인 메모리 관리가 가능합니다.
단점은 JVM 위에서 동작하기 때문에 실행 속도가 상대적으로 느리고 다중 상속이나 타입에 엄격합니다.

<br>

### \[Q\] JVM이란 (Java Virtual Machine)

\[A\]
JVM이란, 자바 가상 머신(Java Virtual Machine)의 약자로, 컴퓨터가 자바 바이트 코드를 운영체제에 맞게 실행시키는 역할을 수행하여 플랫폼 독립적 특성을 가지고 있고 가비지컬렉션을 통해 자동으로 메모리 관리를 해줍니다.

<br>

#### JVM 동작 과정

1.  프로그램이 실행되면 JVM은 OS로부터 필요한 메로리를 할당받습니다.
2.  자바 컴파일러(javac)가 자바 소스코드(.java)를 읽어들여 자바 바이트코드(.class)로 변환시킵니다.
3.  Class Loader를 통해 Class 파일들을 JVM으로 로딩합니다.
4.  로딩된 class 파일들은 Execution engine을 통해 해석됩니다.
5.  해석된 바이트코드는 Runtime Data Areas에 배치되어 실질적인 수행이 이루어집니다.

<br>

### \[Q\] 가비지컬렉터

\[A\]
힙 메모리 관리를 위해, 참조되고 있지 않은 객체들을 메모리에서 삭제하는 역할을 합니다.
객체는, 힙영역에 저장되고, 스택 영역에 이를 가르키는 주소값이 저장되는데, 힙영역에서 자신을 가르키는 주소값이 없으면, 참조되고 있지 않는다고 판단하여 제거합니다.
GC의 작업을 수행하기 위해 JVM이 어플리케이션의 실행을 잠시 멈추고, GC를 실행하는 쓰레드를 제외한 모든 쓰레드들의 작업을 중단 후 (Stop The World 과정) 사용하지 않는 메모리를 제거(Mark and Sweep 과정)하고 작업이 재개됩니다.

<br>

### \[Q\] 자바 메모리 구조

\[A\]
자바의 메모리 공간은 크게 Method 영역, Stack 영역, Heap 영역으로 구분되고, 데이터 타입에 따라 할당됩니다.
메소드(Method) 영역은 전역변수와 static변수를 저장하며, Method영역은 프로그램의 시작부터 종료까지 메모리에 남아 있습니다.
스택(Stack) 영역은 지역변수와 매개변수 데이터 값이 저장되는 공간이며, 메소드가 호출될 때 메모리에 할당되고 종료되면 메모리가 해제됩니다. LIFO(Last In First Out) 구조를 갖고 변수에 새로운 데이터가 할당되면 이전 데이터는 지워집니다.  
힙(Heap) 영역은 new 키워드로 생성되는 객체(인스턴스), 배열 등이 Heap 영역에 저장되며, 가비지 컬렉션에 의해 메모리가 관리되어집니다.

각 메모리 영역이 할당되는 시점은?  
Method 영역 : JVM이 동작해서 클래스가 로딩될 때 생성  
Stack 영역 : 컴파일 타임 시 할당  
Heap 영역 : 런타임시 할당

※ 컴파일 타임 : 소스코드가 기계어로 변환되어 실행가능한 프로그램이 되는 과정
※ 런타임 : 컴파일 타임 이후 프로그램이 실행되는 때

<br>

### \[Q\] 자바 어플리케이션 실행과정

\[A\]
.java 파일을 생성 후 build하면 java compiler의 javac의 명령어를 통해 바이트코드(.class)를 생성합니다. 그 후 Class Loader를 통해 JVM 메모리 내로 로드합니다.

<br>

### \[Q\] 기본형과 참조형

\[A\]
primitive type는 기본 데이터 타입으로 byte, short, char, int, float, double, boolean이 있습니다.
reference type은 참조 데이터 타입으로 기본 데이터 타입을 제외하고는 모두 참조 데이터 타입입니다.

참조 데이터 타입의 종류는 class, array, interface 등이 있습니다.  
참조 타입은 값이 저장된 곳의 주소를 저장합니다.

<br>

**primitive type과 reference type의 차이점**

기본 데이터 타입은 실제 데이터 값 자체를 저장합니다.  
데이터의 크기가 작고 고정적이기 때문에 메모리의 Stack 영역에 저장됩니다.  
반면, array와 class와 같은 참조 데이터 타입은 객체가 메모리 상에 위치한 주소를 저장합니다.  
데이터의 크기가 동적이기 때문에 동적으로 관리하는 Heap 영역에 저장됩니다.  
또한, 참조 데이터 타입의 경우 더이상 참조하는 변수가 없을 때, 가비지 컬렉션에 의해 파괴 됩니다.

<br>

**기본 데이터 타입과 참조 데이터 타입이 사용되는 경우**

**primitive type**

primitive type은 null을 다루지도 못하고, generics에 담기지도 못합니다.  
primitive type이 reference type과 비교해서 갖는 장점은 성능과 메모리에 이점이 있습니다.  
reference type은 스택 메모리에는 참조 값만 있고 실제 값은 힙 메모리에 존재하기 때문입니다.

따라서 reference type은 값이 필요로 할 때마다, primitive type과 비해 접근 속도가 느려지게 됩니다.

**reference type**

데이터가 동적이지 않으면, 성능과 메모리에 장점이 있는 primitive type을 먼저 고려해보고,만약 Null을 다뤄야 하거나 Generic 타입에서 사용되어야 한다면 reference type을 사용합니다.

<br>

### \[Q\] ‘==’과 ‘equals’의 차이

\[A\]
‘==’은 객체의 같음을 비교하는 것이고, ‘equals’는 객체의 주소를 비교하는 것입니다. 기본적으로 자바에서는 Object 클래스에 정의된 equals() 메소드가 동등성 비교를 합니다.

<br>

### \[Q\] 객체란, 클래스, 메서드, 변수

\[A\]
클래스는 객체를 만들어내기 위한 설계도 혹은 틀이라고 할 수 있고, 객체를 생성하는데 사용합니다.
객체는 설계도(클래스)를 기반으로 생성되며, 자신의 고유 이름과 상태, 행동을 갖습니다.  
여기서 상태는 필드(fields), 행동은 메소드(Method)라고 표현합니다.  
객체에 메모리가 할당되어 실제로 활용되는 실체는 '인스턴스'라고 부릅니다.
변수란 데이터(data)를 저장할 수 있는 메모리 공간을 의미하며, 이렇게 저장된 값은 변경될 수 있습니다.

<br>

### \[Q\] 생성자

\[A\]
생성자는 클래스와 같은 이름의 메소드로, 객체가 생성될 때 호출되는 메소드입니다.  
명시적으로 생성자를 만들지 않아도 default로 만들어지며, 생성자는 파라미터를 다르게하여 오버로딩할 수 있습니다.

<br>

### \[Q\] final 키워드 VS 상수

\[A\]
final 키워드는 변수, 메서드, 클래스 등 다양한 요소에 적용될 수 있습니다.  
변수에 final 키워드를 사용하면 해당 변수의 값이 한 번 할당되면 변경할 수 없습니다. 예를 들어, Java에서 final int x = 10;와 같이 선언한 경우 x의 값을 변경할 수 없습니다.  
메서드에 final 키워드를 사용하면 해당 메서드를 서브클래스에서 오버라이드(재정의)할 수 없습니다. 이것은 메서드의 동작을 변경하지 못하도록 보호하는 데 사용됩니다.  
클래스에 final 키워드를 사용하면 해당 클래스를 상속할 수 없게 됩니다. 즉, 더 이상 하위 클래스를 만들 수 없습니다.

상수는 일반적으로 프로그램에서 변경되지 않는 값을 나타내기 위해 사용됩니다.  
대부분의 프로그래밍 언어에서 상수는 변수에 할당된 값이 프로그램 실행 도중 변경되지 않도록 보장합니다.  
상수는 종종 대문자로 작성하며, 다양한 언어에서 const, final, static final, val, let 등 다양한 키워드로 정의될 수 있습니다.

<br>

### \[Q\] 지역 변수 VS 전역 변수

\[A\]  
지역변수란 메서드 안에 생성되는 변수를 말하며 메서드가 실행될 때 생성되고 메서드가 종료되면 사라지게 됩니다.
전역 변수란 함수의 외부에서 선언된 변수로 프로그램의 어디에서나 접근할 수 있으며, 프로그램이 종료되어야만 메모리에서 사라집니다. 전역 변수는 메모리상의 데이터(data) 영역에 저장되며, 직접 초기화하지 않아도 0으로 자동 초기화됩니다.

<br>

### \[Q\] static과 instance 차이

\[A\]
non-static멤버는 인스턴스멤버라고 부르며 객체 생성시 heap영역에 생성되고 객체마다 별도로 존재합니다.  
객체 생성시에 생성되며 객체가 사라지게 되면 인스턴스 멤버도 사라지게 됩니다.  
인스턴스멤버는 객체 내에 각각의 공간을 유지하여 다른 객체와 공유되지 않습니다.

static멤버는 클래스멤버라고 부르며 객체 내부가 아닌 컴파일시 static영역에 생성됩니다.  
객체를 생성하지 않아도 이미 생성되어있기 때문에 객체 생성없이 사용이 가능하며 프로그램이 종료될 때 사라지게 됩니다. 클래스멤버는 동일한 모든 클래스의 모든 객체들에 의해 공유됩니다. static은 공통속성으로 사용되는 클래스변수에 붙이거나 인스턴스멤버를 사용하지 않는 메서드일 때 사용하게 됩니다.

<br>

### \[Q\] Java의 main 메서드가 static인 이유

\[A\]
**public static void main(String\[\] args){}의 의미**
main()메서드는 프로그램이 실행되는 시작과 끝이되는 지점입니다. JRE는 프로그램 안에 main()메서드가 있는지 확인한 후 main()메서드를 실행하게 됩니다. main()메서드가 끝나면 JRE는 JVM을 종료하고 JRE자체도 메모리에서 사라지게됩니다.

public : 어디에서나 접근이 가능해야합니다.  
static : main() 메소드는 호출자가 없기 때문에 프로그램 실행 순간에 메모리에 할당되어 실행될 수 있도록 하기 위함 입니다.
void : main()메소드가 끝나게 되면 프로그램도 종료되므로 리턴값을 사용할 호출자가 없기 때문입니다.  
main() : 관례적으로 프로그램의 시작점을 main으로 사용하고 있습니다.  
String\[\] args : 프로그램 실행시에 첫 스레드인 main에게 데이터를 넘겨주고 싶을 때를 위한 파라미터입니다.

<br>

### \[Q\] 컬렉션 프레임워크

\[A\]
Collection(컬렉션)이란 데이터의 집합, 그룹을 의미합니다. JCF(Java Collection Framework)는 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합을 의미합니다.
자바 컬렉션에는 List, Set, Map 인터페이스를 기준으로 여러 구현체가 존재하고, 이에 더해 Stack, Queue 인터페이스도 존재합니다.

**Collection 주요 인터페이스**

-   List: 순서가 있으며, 데이터 중복 허용
-   Set: 순서가 없으며, 데이터 중복을 허용하지 않음
-   Map: Key&Value 구조, Key는 중복을 허용하지 않으며, Value는 중복을 허용

<br>

### \[Q\] List, Set, Map

\[A\]
 List는 데이터의 순서가 있고 중복이 허용됩니다. Set은 순서가 없으며 중복 또한 허용되지 않습니다. 마지막으로 Map은 키와 값을 쌍으로 저장하며 순서가 없고 키를 기준으로 중복을 불허한다는 특징이 있습니다. 

List
    -   ArrayList: 단방향 포인터 구조, 순차적 조회에 강점
    -   LinkedList: 양방향 포인터 구조, 데이터 삽입, 삭제가 빠름
Set
    -   HashSet: 순서를 보장하지 않으며, 데이터 중복을 허용하지 않음
    -   LinkedHashSet: HashSet 특징 + 입력된 순서를 보장한다.
    -   TreeSet: 트리기반으로 데이터들 오름차순으로 정렬 저장
Map
    -   HashMap: Key는 중복을 허용하지 않으며, Value는 중복을 허용
    -   LinkedHashMap: HashMap 특징 + 입력된 순서를 보장한다.
    -   TreeMap: 트리기반으로 Key와 Value를 저장하며, Key를 기준으로 오름차순 정렬

<br>

### \[Q\] 배열 VS 리스트

\[A\]  
배열과 리스트는 데이터를 저장하고 관리하는데 사용되는 자료구조로 배열은 크기가 고정되며 인덱스를 통해 빠른 접근이 가능한 자료구조입니다. 리스트는 크기를 동적으로 조절할 수 있어 요소를 추가하거나 삭제에 용이하지만 요소에 접근하려면 순차적으로 탐색하여야 하기 때문에 일반적으로 배열보다 접근 속도가 느립니다. 

<br>

-   저장할 데이터의 개수가 정해져 있고 / 삽입, 삭제 작업이 적고 / 특정 위치의 데이터를 조회하는 작업이 많다면 배열
-   저장할 데이터의 개수가 미정이고 / 삽입, 삭제 작업이 많고 / 특정 위치 데이터를 조회하는 경우가 별로 없다면 리스트

<br>

### \[Q\] Array VS ArrayList VS LinkedList

\[A\]  
Array이란 순서가 있는 값을 의미합니다.

Array는 선언할 때 Size를 고정합니다.  
각 데이터 요소들은 인접한 위치에 저장됩니다.  
데이터를 읽을 때, index를 통해서 읽기때문에 조회의 속도가 빠릅니다.  
삽입, 삭제가 일어날때, 데이터들은 삭제나, 삽입이 일어난 index보다 큰 인덱스를 가진값을 모두 이동시켜야하기 때문에, O(n)을 가집니다.

LinkedList  
자료의 주소값을가지는 노드가 인접해 있는 노드의 위치를 가르키고 있는 구조입니다.  
가르키는 위치만 변경하면 되기 때문에, 삽입삭제 시, 시간 복자도가 O(1) 입니다.  
데이터를 조회할 때는, 루트노드부터 순차적으로 탐색하여야 합니다.

**ArrayList : 메모리 밀도가 1, 삭제 시 기능 고려 , 검색 빠름**
**LinkedList : 메모리 밀도 분포, 삭제 시 빠름, 검색 시 기능 고려**

<br>

### \[Q\] Generic

\[A\] 
제네릭이란, 데이터 타입(data type, 자료형)을 일반화(generalize)하는 것으로, 데이터타입을 컴파일 시 미리 지정해 두는 것을 말합니다. 제네릭은 보통 클래스나 리스트 타입을 미리 지정할 때 사용됩니다.

**자바 제네릭스의 형식과 약어**
-   \<T\> == Type
-   \<E\> == Element
-   \<K\> == Key
-   \<V\> == Value
-   \<N\> == Number
-   \<R\> == Result

제네릭은 데이터의 타입을 하나로 지정하지 않고 사용할 때마다 범용적이고 포괄적으로 지정한다는 의미입니다.  
제네릭 타입을 사용함으로써 잘못된 타입이 사용될 수 있는 문제를 컴파일 과정에서 제거할 수 있어 에러를 사전에 방지할 수 있습니다.

<br>

### \[Q\] String VS StringBuffer VS StringBuilder

\[A\]  
String은 불변성을 가진 객체로 문자열을 수정, 삽입하는 경우 새로운 문자열을 생성합니다.

String Buffer와 String Builder는 가변의 속성을 가지며 문자열 객체를 버퍼에 임시로 저장합니다.  
수정, 삭제, 삽입 시 버퍼에 저장된 문자열 객체를 수정하고 ToString() 메서드로 문자열을 반환합니다.

String Buffer와 String Builder의 차이점은 동기화의 유무 입니다.  
StringBuffer는 동기화를 지원하기 때문에, 멀티 스레드환경헤서 유리합니다.  
SringBuilder는 동기화를 지원하지 않기 때문에, 단일 스레드환경에서 유리합니다.  
StringBuilder는 동기화를 지원하지 않는 반면, 속도면에선 StringBuffer 보다 성능이 좋습니다.

<br>

**string, stringbuffer, stringbuilder 가 사용되면 좋을 때**

String  
변하지 않는 문자열을 자주 사용할 경우

StringBuilder  
단일 스레드 환경과 문자열의 추가, 수정, 삭제 등이 빈번히 발생하는 경우 StringBuilder를 사용하는 것이 성능면에서 유리

StringBuffer  
동기화를 지원하여 멀티 스레드 환경에서도 안전하게 동작  
멀티 스레드 환경 과 문자열의 추가, 수정, 삭제 등이 빈번히 발생하는 경우 StringBuffer를 사용하는 것이 성능면에서 유리할 것입니다.

<br>

### \[Q\] 객체지향 언어/객체지향 프로그래밍이란 ( OOP : Object Oriented Programming)

\[A\]  
우리가 실생활에서 쓰는 모든 것을 객체라 하며, 객체 지향 프로그래밍은 프로그램 구현에 필요한 객체들 간의 상호작용을 통해 프로그램을 만드는 것을 말합니다.  
즉, 기능이 아닌 객체가 중심이며 "누가 어떤 일을 할 것인가?"가 핵심입니다.
특징으로는 캡슐화, 상속, 다형성, 추상화 등이 있고, 모듈 재사용으로 확장 및 유지보수가 용이합니다.

<br>

### \[Q\] 객체지향 설계원칙

\[A\]  
단일 책임 원칙(SRP) : 한 클래스는 하나의 책임만 가져야 합니다.  
개방-폐쇄 원칙(OCP) : 확장에는 열려있고, 수정에는 닫혀있어야 합니다.  
리스코프 치환 원칙(LSP) : 하위 타입은 항상 상위 타입을 대체 할 수 있어야 합니다.  
인터페이스 분리 원칙(ISP) : 인터페이스 내에 메소드는 최소한 일수록 좋습니다. (하나의 일반적인 인터페이스보다 여러 개의 구체적인 인터페이스가 낫다.)
의존관계 역전 원칙(DIP) : 구체적인 클래스보다 상위 클래스, 인터페이스, 추상클래스와 같이 변하지 않을 가능성이 높은 클래스와 관계를 맺어야 합니다. DIP 원칙을 따르는 가장 인기 있는 방법은 의존성 주입(DI)입니다.

<br>

### \[Q\] 캡슐화

\[A\]  
캡슐화란 객체가 은닉화 된 상태에서 메소드나 생성자의 일의 내용을 알 필요 없이, 형태(메서드 이름/파라미터/리턴 타입)만 알면 호출해서 사용할 수 있는 특성입니다.
은닉화란 외부 객체로부터 '속성 값(데이터, 멤버 변수값)'을 감추는 특성 입니다.

<br>

### \[Q\] 접근제한자

\[A\] 접근제한자는 클래스, 인터페이스, 멤버변수, 함수 등의 접근을 제어하는 지시어를 말합니다.  
접근제어자를 사용함으로써, 외부 객체의 무분별한 접근으로부터 내부 데이터를 보호하므로 데이터 무결성을 지킬 수 있습니다.
public은 모든 패키지, 모든 클래스의 접근이 가능하고
protected는 같은 패키지, 모든 클래스의 접근 가능하나 다른 패키지인 경우 자식 클래스의 접근은 가능합니다.
default는 같은 패키지 내 클래스만 접근 가능 하고
private은 같은 클래스 내 접근만 가능합니다.

<br>

### \[Q\] private 메서드 접근방법

\[A\]
클래스 내부의 필드는 Private로 선언하고 해당 필드에 대해 getter/setter를 Public으로 선언하여 외부 접근을 선택적으로 제어할 수 있습니다. 
<br>

### \[Q\] Inner Class

\[A\]
내부 클래스(inner class)란 하나의 클래스 내부에 선언된 또 다른 클래스를 의미합니다.
내부 클래스는 보통 두 클래스가 서로 긴밀한 관계가 있거나, 하나의 클래스또는 메소드에서만 사용되는 클래스일 때 이용되는 기법 입니다.
장점으로는 서로 관련 있는 클래스를 논리적으로 묶어서 표현함으로써, 캡슐화를 증가시켜 보안성을 높일 수 있고, 코드의 복잡성을 낮출 수 있습니다.

<br>

### \[Q\] 상속

\[A\]  
상속이란 부모 객체의 특징을 그대로 물려받는 것을 의미하고, 자바에서는 인터페이스 상속과 클래스 상속이 있습니다. 이를 통해 모듈의 재사용성이 높아지고, 다형성을 구현할 수 있습니다. 하지만 무분별한 상속의 남용은 시스템의 결합도를 올려 추후 변경에 유연하게 대응하지 못하기 때문에 자제해야 한다고 알고 있습니다.

<br>

### \[Q\] 다형성

\[A\]  
다형성(polymorphism)이란 같은 자료형에 여러가지 타입의 데이터를 대입하여 다양한 결과를 얻어낼 수 있는 성질을 의미합니다. 자바에서는 대표적으로 오버로딩, 오버라이딩, 인터페이스, 추상메소드, 추상클래스 등이 해당됩니다.

다형성의 장점으로는 기능이 추가되거나 수정되어야 할 때 기존의 코드를 변경하지 않고 인터페이스의 구현체를 만듦으로써 확장성이 향상 되고 유지보수가 용이해집니다.
추상클래스나 인터페이스를 상속받아 기능을 구현함으로써 구체적인 구현에 대한 의존성을 가지지 않아 결합도가 낮은 프로그래밍을 할 수 있습니다.  

<br>

### \[Q\] 오버로딩 VS 오버라이딩

\[A\]  
오버로딩이란 같은 이름을 가지는 메소드를 여러개 가지는 것을 말합니다.  
메소드의 이름은 같지만 매개변수의 개수, 타입 등을 다르게 함으로써 같은 메소드의 이름을 다른 기능으로 재정의하여 사용할 수 있습니다. 메소드 이름 1개로 여러 기능으로 재정의하여 사용할 수 있기 때문에 가독성이 좋아집니다. 자주 사용하는 예로는 print 메서드가 있습니다.

오버라이딩이란 하위 클래스에서 상위 클래스의 메소드를 재정의하여 사용하는 것을 말합니다.  
상위 클래스의 기능을 하위클래스에서 필요한 부분만 수정하여 원하는 기능으로 구현하는 것을 말합니다.  
오버라이딩은 코드의 중복을 줄이므로 기능 확장에 이점이 있다고 생각합니다. 실생활의 예로는 부모님에게 물려 받은 물건을 자식이 튜닝하여 사용하는 것과 같습니다.

오버라이딩과 오버로딩 모두 하나의 기능이 여러 역할을 할 수 있게 해주어 객체지향의 다형성의 특징을 가지게 합니다.

<br>

### \[Q\] 추상화

\[A\]  
추상화란 복잡한 자료, 모듈, 시스템 등으로부터 핵심적인 개념 또는 기능을 간추려 내는 것을 의미합니다. 예를 들어 모든 정보가 다 담겨있는 지도에서 필요한 정보들만 추려내어 약도를 만드는 것과 같습니다.

추상 클래스(Abstract Class)의 특징으로는 추상메서드를 하나 이상 가진 클래스이어야 하고, 자신의 생성자로 객체 생성이 불가능합니다. 하위 클래스를 참조하여 상위 클래스의 객체를 생성하여, 하위 클래스를 제어하기 위해 사용됩니다.

<br>

### \[Q\] 인터페이스

\[A\]  
Interface란 일종의 추상 클래스 입니다. 
인터페이스의 특징으로는 오직 추상메서드와 상수만을 멤버로 가지고, Implements 키워드를 사용하여 정의합니다.
상속의 관계가 없는 클래스 간 서로 공통되는 로직을 구현하여 쓸 수 있도록 하고 Extends는 하나의 클래스만 상속 가능하나 Interface는 다중 상속이 가능합니다.

<br>

### \[Q\] 추상 클래스 VS 인터페이스

\[A\]  
추상 클래스는 abstract로 선언되거나 추상메서드를 하나 이상 포함한 클래스를 말합니다.  
클래스이기 때문에 하나만 상속이 가능합니다.

인터페이스는 구현체 없이 메서드에 대한 명세만 가지고 있고 모든 메서드가 추상메서드 이어야 합니다. 다만 Java 1.8 이상부터는 default 키워드를 사용해 일반 메서드도 정의할 수 있습니다.
인터페이스는 implements 키워드를 사용하여 상속받는 자식클래스에 모든 메서드에 대한 구현을 강제하며, 다중 상속이 가능합니다.  

추상클래스는 기능의 확장을 목적으로 하고 인터페이스는 규격을 맞추는 것을 목적으로 합니다.

<br>

### \[Q\] Error와 Exception의 차이

\[A\]  
Error는 실행 중 일어날 수 있는 치명적 오류를 말합니다. 컴파일 시점에 체크할 수 없고, 오류가 발생하면 프로그램이 비정상적으로 종료되며 예측 불가능한 UncheckedException에 속합니다.  
반면, Exception은 Error보다 비교적 경미한 오류이며, try-catch를 이용해 프로그램의 비정상 종료를 막을 수 있습니다.

<br>

**CheckedException과 UnCheckedException의 차이**
CheckedException은 실행하기 전에 예측 가능한 예외를 말하고, 반드시 예외 처리를 해야 합니다.  
대표적인 Exception으로는 IOException, ClassNotFoundException 등이 있습니다.
UncheckedException은 실행하고 난 후에 알 수 있는 예외를 말하고, 따로 예외처리를 하지 않아도 됩니다.  
대표적인 Exception으로는 NullPointerException, ArrayIndexOutOfBoundException 등이 있습니다

<br>

### \[Q\] Exception 처리 방법 - 예외 처리(exception handling)

\[A\]  
자바에서는 프로그램이 실행되는 도중 발생하는 예외를 처리하기 위해 try / catch / finally 문을 사용할 수 있습니다.

**문법**

```
try {

//예외를 처리하길 원하는 실행 코드

} catch (e1) {

//e1 예외가 발생할 경우에 실행될 코드

} catch (e2) {

//e2 예외가 발생할 경우에 실행될 코드

}

finally {

//예외 발생 여부와 상관없이 무조건 실행될 코드

}
```

try 블록은 기본적으로 맨 먼저 실행되는 코드로 여기에서 발생한 예외는 catch 블록에서 처리됩니다.
catch 블록은 try 블록에서 발생한 예외 코드나 예외 객체를 인수로 전달받아 그 처리를 담당합니다.
finally 블록은 이 블록은 try 블록에서 예외가 발생하건 안 하건 맨 마지막에 무조건 실행됩니다.

<br>

### \[Q\] 동기 VS 비동기 방식

\[A\]
동기(synchronous) 방식은 요청과 결과가 동시에 일어나는 방식으로 요청을 보낸 후 응답을 받아야 다음 동작이 진행됩니다. 설계가 간단하고, 직관적이나 요청에 대한 결과가 반환되기 전까지 대기해야 하여 비동기 방식에 비해 시간이 오래 걸립니다.

비동기(Asynchronous) 방식은 요청과 결과가 동시에 일어나지 않는 방식으로 사용자가 서버로 요청을 보냈을 경우 요청에 대한 응답을 기다리지 않고, 다른 것을 수행할 수 있으며 서버로 다른 요청을 보낼 수도 있습니다.  
요청에 대한 결과가 반환되기 전에 다른 작업을 수행할 수 있어서 자원을 효율적으로 사용할 수 있으나 동기 방식보다 설계가 복잡합니다.

<br>

### \[Q\] synchronized

\[A\]  
Java에서 지원하는 synchronized 키워드는 여러 쓰레드가 하나의 자원을 이용하고자 할 때, 한 스레드가 해당 자원을 사용중인 경우, 데이터에 접근할 수 없도록 막는 키워드입니다. synchronized 키워드를 이용하면 병렬 상황에서 자원의 접근을 안전하게 하지만, 자원을 이용하지 않는 쓰레드는 락에 의한 병목현상이 발생하게 됩니다.

<br>

### \[Q\] 프로세스, 스레드

\[A\]  
프로세스는 운영체제로부터 자원을 할당 받은 작업의 단위이고, 스레드는 프로세스가 할당 받은 자원을 이용하는 실행 흐름의 단위입니다.

<br>

### \[Q\] 멀티 스레드의 장점과 단점

\[A\]  
장점으로는 
프로그램의 일부분(스레드)이 중단되거나 긴 작업을 수행하더라도 프로그램의 수행이 계속 되어 사용자에 대한 응답성이 증가한다는 것 입니다. 
또한 프로세스 내 자원들과 메모리를 공유하기 때문에 메모리 공간과 시스템 자원 소모가 줄어 들고 스레드 간 통신이 필요한 경우에도 쉽게 데이터를 주고 받을 수 있습니다.

단점으로는
공유하는 자원에 동시에 접근하는 경우, 프로세스와는 달리 스레드는 데이터와 힙 영역을 공유하기 때문에 어떤 스레드가 다른 스레드에서 사용 중인 변수나 자료구조에 접근하여 엉뚱한 값을 읽어오거나 수정할 수 있습니다. 
이런 경우 동기화를 통해 스레드의 작업 처리 순서와 공유 자원에 대한 접근을 컨트롤해야 합니다. 그러나 불필요한 부분까지 동기화를 하는 경우, 과도한 lock으로 인해 병목 현상을 발생시켜 성능이 저하될 가능성이 높기 때문에 주의해야 한다고 알고 있습니다.

<br>

### \[Q\] JDBC(Java Database Connectivity)

\[A\] 
자바에서 데이터베이스를 접속할 수 있도록 해주는 자바 API 입니다. JDBC는 데이터베이스에서 자료를 쿼리하거나 업데이트 하는 방법들을 제공합니다.

<br>

### \[Q\] API(Applictation Programming Interface)

\[A\]  
API란 두 소프트웨어 구성 요소가 서로 통신할 수 있게 하는 메커니즘입니다. 예를 들어, 기상청의 소프트웨어 시스템에는 일일 기상 데이터가 들어 있습니다. 휴대폰의 날씨 앱은 API를 통해 이 시스템과 ‘대화’하여 휴대폰에 매일 최신 날씨 정보를 표시합니다.

<br>

### \[Q\] RestfulAPI

\[A\]
HTTP 통신에서 CRUD 요청을 리소스와 메서드로 표현하여 특정한 형태로 전달하는 방식으로 자원(URI), 요청 방식(GET, POST, UPDATE, DELETE), 자원의 표현 형태( JSON, XML)로 구성됩니다. 
<br>

### \[Q\] Get VS Post 방식

\[A\]  
Get 방식은 클라이언트에서 서버로 데이터를 전달할 때, 주소 뒤에 "이름"과 "값"이 결합된 스트링 형태로 전달합니다.
주소창에 쿼리 스트링이 그대로 보여지기 때문에 보안성이 떨어지고 길이에 제한이 있어 전송 가능한 데이터의 한계가 있으나 Post방식보다 상대적으로 전송 속도가 빠릅니다.

Post 방식은 일정 크기 이상의 데이터를 보내야 할 때 사용합니다.
서버로 보내기 전에 데이터를 인코딩하고, 전송 후 서버에서는 다시 디코딩 작업을 하므로 보안성이 높으나 Get방식보다 전송 속도가 느립니다. 
문자열 데이터 뿐만 아니라, 라디오 버튼, 텍스트 박스 같은 객체들의 값도 전송 가능합니다.

Get은 주로 웹 브라우저가 웹 서버에 데이터를 요청할 때 사용하고, Post는 웹 브라우저가 웹 서버에 데이터를 전달하기 위해 사용합니다.

<br>

### \[Q\] Cookie VS Session

\[A\]  
Session은 특정 웹사이트에서 사용자가 머무르는 기간 또는 한 명의 사용자의 한번의 방문을 의미 합니다.
Session에 관련된 데이터는 Server에 저장되어 브라우저가 닫히거나 서버에서 삭제 시 사라지나 Cookie에 비해 보안성이 좋습니다.

Cookie는 사용자 정보를 유지할 수 없다는 HTTP의 한계를 극복할 수 있는 방법으로 인터넷 웹 사이트의 방문 기록을 남겨 사용자와 웹 사이트 사이를 매개해 주는 정보입니다.
인터넷 사용자가 특정 웹서버에 접속할 때 생성되는 정보를 담은 임시 파일로써 Server가 아닌 Client에 텍스트 파일로 저장되어 다음에 해당 웹서버를 다시 찾을 경우 웹서버에서 클라이언트의 정보 등을 파악할 때 사용됩니다.
Cookie는 Client PC에 저장되는 정보기 때문에, 다른 사용자에 의해서 임의로 변경이 가능하여 정보 유출의 가능성이 커 Session보다 보안성이 낮습니다.

**Session 대신 보안성이 낮은 Cookie를 사용하는 이유**
모든 정보를 Session에 저장하면 Server의 메모리를 과도하게 사용하게 되어 Server에 무리가 가기 때문입니다.

<br>

### \[Q\] jsp, servlet

\[A\]  
Servlet은 자바 언어로 웹 개발을 하기 위해 만들어진 것으로, 컨테이너가 이해할 수 있도록 순수 자바 코드로만 이루어져 있습니다.(Html in JAVA)  
JSP는 html 기반에 자바 코드를 블록화하여 삽입한 것으로 서블릿을 좀 더 쉽게 접근할 수 있도록 만들어진 것입니다.(JAVA in Html)

<br>

### \[Q\] model1 과 model2 의 차이점

\[A\]  
model1은 데이터를 저장하는 영역만 분리시켜두고 JSP페이지 안에서 클라이언트에게 보여지는 부분뿐만 아니라 로직 처리도 함께 하기 위해 자바 코드가 사용됩니다. 요청이 오면, 직접 자바빈이나 클래스를 이용해 작업을 처리하고, 이를 클라이언트에 출력해줍니다. 구조가 단순한 장점이 있지만, JSP 내에서 html 코드와 자바 코드가 같이 사용되면서 복잡해지고 유지보수가 어려운 단점이 있습니다.

model2는 이와는 다르게 모든 처리를 JSP에서만 담당하는 것이 아니라 서블릿을 만들어 역할 분담을 하는 패턴입니다. 요청 결과를 출력해주는 뷰만 JSP가 담당하고, 흐름을 제어해주고 비즈니스 로직에 해당하는 컨트롤러의 역할을 서블릿이 담당하게 됩니다. 이처럼 역할을 분담하면서 유지보수가 용이해지는 장점이 있지만 습득하기 힘들고 구조가 복잡해지는 단점도 있습니다.

<br>

### \[Q\] 어노테이션

\[A\]  
자바에서 Annotation은 코드 사이에 주석처럼 쓰이며 특별한 의미, 기능을 수행하도록 하는 기술입니다.
프로그램에게 추가적인 정보를 제공해주는 메타데이터(데이터를 위한 데이터) 라고 볼 수 있습니다.

**종류**<br>
@ComponentScan<br>
@Component와 @Service, @Repository, @Controller, @Configuration이 붙은 클래스 Bean들을 찾아서 Context에 bean등록을 해주는 Annotation이다.<br>
@Component Annotation이 있는 클래스에 대하여 bean 인스턴스를 생성<br>
ApplicationContext.xml에 <bean id="jeongpro" class="jeongpro" /> 과 같이 xml에 bean을 직접등록하는 방법도 있고 위와 같이 Annotation을 붙여서 하는 방법도 있다.<br>
base-package를 넣으면 해당 패키지 아래에 있는 컴포넌트들을 찾고 그 과정을 spring-context-버전(4.3.11.RELEASE).jar에서 처리한다.<br>
Spring에서 @Component로 다 쓰지 않고 @Repository, @Service, @Controller등을 사용하는 이유는, 예를들어 @Repository는 DAO의 메<br>소드에서 발생할 수 있는 unchecked exception들을 스프링의 DataAccessException으로 처리할 수 있기 때문이다.
또한 가독성에서도 해당 애노테이션을 갖는 클래스가 무엇을 하는지 단 번에 알 수 있다.<br>
자동으로 등록되는 Bean의 이름은 클래스의 첫문자가 소문자로 바뀐 이름이 자동 적용된다.<br>
HomeController -> homeController<br><br>
@Component<br>
@Component 은 개발자가 직접 작성한 Class를 Bean으로 등록하기 위한 Annotation이다.<br>
Component에 대한 추가 정보가 없다면 Class의 이름을 camelCase로 변경한 것이 Bean id로 사용된다.<br>
@Component는 @Bean과 다르게 name이 아닌 value를 이용해 Bean의 이름을 지정한다.<br><br>
@Bean<br>
@Bean은 개발자가 직접 제어가 불가능한 외부 라이브러리등을 Bean으로 만들려할 때 사용되는 Annotation이다.<br>
ArrayList같은 라이브러리등을 Bean으로 등록하기 위해서는 별도로 해당 라이브러리 객체를 반환하는 Method를 만들고 @Bean Annotation을 사용하면 된다.<br>
@Bean에 name이라는 값을 이용하면 자신이 원하는 id로 Bean을 등록할 수 있다.<br><br>
@Autowired<br>
속성(field), setter method, constructor(생성자)에서 사용하며 Type에 따라 알아서 Bean을 주입 해준다.<br>
무조건적인 객체에 대한 의존성을 주입시킨다.<br>
@Autowired를 사용할 시, 스프링이 자동적으로 값을 할당한다.<br>
Controller 클래스에서 DAO나 Service에 관한 객체들을 주입 시킬 때 많이 사용한다.<br>
필드, 생성자, 입력 파라미터가 여러 개인 메소드(@Qualifier는 메소드의 파라미터)에 적용 가능하다.<br>
Type을 먼저 확인한 후 못 찾으면 Name에 따라 주입한다.<br>
Bean을 주입받는 방식 (3가지)<br>
@Autowired<br>
setter<br>
생성자 (@AllArgsConstructor 사용) -> 권장방식<br><br>
@Inject<br>
@Autowired 어노테이션과 비슷한 역할을 한다.<br><br>
@Controller<br>
Spring의 Controller를 의미한다.<br>
Spring MVC에서 Controller클래스에 쓰인다.<br><br>
@RestController<br>
Spring에서 Controller 중 View로 응답하지 않는, Controller를 의미한다.<br>
method의 반환 결과를 JSON 형태로 반환한다.<br>
이 Annotation이 적혀있는 Controller의 method는 HttpResponse로 바로 응답이 가능하다.<br><br>
@ResponseBody 역할을 자동적으로 해주는 Annotation이다.<br>
@Controller + @ResponseBody를 사용하면 @ResponseBody를 모든 메소드에서 적용한다.<br>
@Controller 와 @RestController 의 차이<br><br>
@Controller<br>
API와 view를 동시에 사용하는 경우에 사용한다.<br>
대신 API 서비스로 사용하는 경우는 @ResponseBody를 사용하여 객체를 반환한다.<br>
view(화면) return이 주목적이다.<br><br>
@RestController<br>
view가 필요없는 API만 지원하는 서비스에서 사용한다.<br>
Spring 4.0.1부터 제공<br><br>
@RequestMapping 메서드가 기본적으로 @ResponseBody 의미를 가정한다.<br>
data(json, xml 등) return이 주목적이다.<br>
즉 @RestController = @Controller + @ResponseBody 이다.<br><br>
@Service<br>
Service Class에서 쓰인다.<br>
비즈니스 로직을 수행하는 Class라는 것을 나타내는 용도이다.<br><br>
@Repository<br>
DAO class에서 쓰인다.<br>
DataBase에 접근하는 method를 가지고 있는 Class에서 쓰인다.<br><br>
@EnableAutoConfiguration<br>
Spring Application Context를 만들 때 자동으로 설정하는 기능을 켠다.<br>
classpath의 내용에 기반해서 자동으로 생성해준다.<br>
만약 tomcat-embed-core.jar가 존재하면 톰캣 서버가 setting된다.<br><br>
@Configuration<br>
@Configuration을 클래스에 적용하고 @Bean을 해당 Class의 method에 적용하면 @Autowired로 Bean을 부를 수 있다.<br>
@Required<br>
setter method에 적용해주면 Bean 생성시 필수 프로퍼티 임을 알린다.<br>
Required Annotation을 사용하여 optional 하지 않은, 꼭 필요한 속성들을 정의한다.<br>
영향을 받는 bean property를 구성할 시에는 XML 설정 파일에 반드시 property를 채워야 한다.<br><br>
@Qualifier("id123")<br>
@Autowired와 같이 쓰이며, 같은 타입의 Bean 객체가 있을 때 해당 아이디를 적어 원하는 Bean이 주입될 수 있도록 하는 Annotation이다.<br>
같은 타입이 존재하는 경우 ex) 동물 = 원숭이, 닭, 개, 돼지<br>
같은 타입의 Bean이 두 개 이상이 존재하는 경우에 Spring이 어떤 Bean을 주입해야 할지 알 수 없어서 Spring Container를 초기화하는 과정에서 예외를 발생시킨다.<br>
이 경우 @Qualifier을 @Autowired와 함께 사용하여 정확히 어떤 bean을 사용할지 지정하여 특정 의존 객체를 주입할 수 있도록 한다.<br>
xml 설정에서 bean의 한정자 값(qualifier value)을 설정한다.<br>
@Autowired 어노테이션이 적용된 주입 대상에 @Qualifier 어노테이션을 설정한다.<br><br>
@Resource
@Autowired와 마찬가지로 Bean 객체를 주입해주는데 차이점은 Autowired는 타입으로, Resource는 이름으로 연결해준다.<br>
javax.annotation.Resource 표준 자바(JSR-250 표준) Annotation으로, Spring Framework 2.5.* 부터 지원 가능한 Annotation이다.<br>
Annotation 사용으로 인해 특정 Framework에 종속적인 어플리케이션을 구성하지 않기 위해서는 @Resource를 사용할 것을 권장한다.<br>
@Resource를 사용하기 위해서는 class path 내에 jsr250-api.jar 파일을 추가해야 한다.<br>
필드, 입력 파라미터가 한 개인 bean property setter method에 적용 가능하다.<br><br>
@PostConstruct, @PreConstruct<br>
의존하는 객체를 생성한 이후 초기화 작업을 위해 객체 생성 전/후에(pre/post) 실행해야 할 method 앞에 붙인다.<br><br>
@PreDestroy<br>
객체를 제거하기 전(pre)에 해야할 작업을 수행하기 위해 사용한다.<br><br>
@PropertySource<br>
해당 프로퍼티 파일을 Environment로 로딩하게 해준다.<br>
클래스에 @PropertySource("classpath:/settings.properties")라고 적고 클래스 내부에 @Resource를 Environment타입의 멤버 변수앞에 적으면 매핑된다.<br><br>
@ConfigurationProperties<br>
yaml파일 읽는다.<br>
default로 classpath:application.properties 파일이 조회된다.<br>
속성 클래스를 따로 만들어두고 그 위에 (prefix="mail")을 써서 프로퍼티의 접두사를 사용할 수 있다.<br><br>
@Lazy<br>
지연로딩을 지원한다.<br>
@Component나 @Bean Annotation과 같이 쓰는데 Class가 로드될 때 스프링에서 바로 bean등록을 마치는 것이 아니라 실제로 사용될 때 로딩이 이뤄지게 하는 방법이다.<br><br>
@Value<br>
properties에서 값을 가져와 적용할 때 사용한다.<br>
private String valueFromFile; 이라고 구성되어 있으면 value.from.file의 값을 가져와서 해당 변수에 주입해준다.<br>
spEL을 이용해서 조금 더 고급스럽게 쓸 수 있다.<br><br>
@SpringBootApplication<br>
@Configuration, @EnableAutoConfiguration, @ComponentScan 3가지를 하나의 애노테이션으로 합친 것이다.<br><br>
@RequestMapping<br>
요청 URL을 어떤 method가 처리할지 mapping해주는 Annotation이다.<br>
Controller나 Controller의 method에 적용한다.<br>
요청을 받는 형식인 GET, POST, PATCH, PUT, DELETE 를 정의하기도 한다.<br>
요청 받는 형식을 정의하지 않는다면, 자동적으로 GET으로 설정된다.<br>
@RequestMapping에 대한 모든 매핑 정보는 Spring에서 제공하는 HandlerMapping Class가 가지고 있다.<br><br>
@CookieValue<br>
쿠키 값을 parameter로 전달 받을 수 있는 방법이다.<br>
해당 쿠키가 존재하지 않으면 500 에러를 발생시킨다.<br>
속성으로 required가 있는데 default는 true다.<br>
false를 적용하면 해당 쿠키 값이 없을 때 null로 받고 에러를 발생시키지 않는다.<br><br>
@CrossOrigin<br>
CORS 보안상의 문제로 브라우저에서 리소스를 현재 origin에서 다른 곳으로의 AJAX요청을 방지하는 것이다.<br>
@RequestMapping이 있는 곳에 사용하면 해당 요청은 타 도메인에서 온 ajax요청을 처리해준다.<br><br>
@ModelAttribute<br>
view에서 전달해주는 parameter를 Class(VO/DTO)의 멤버 변수로 binding 해주는 Annotation이다.<br>
binding 기준은 <input name="id" /> 처럼 어떤 태그의 name값이 해당 Class의 멤버 변수명과 일치해야하고 setmethod명도 일치해야한다.<br><br>
@GetMapping<br>
@RequestMapping(Method=RequestMethod.GET)과 같다.<br>
@PostMapping, @PutMapping, @PatchMapping, @DeleteMapping 등 도 있다.<br><br>
@SessionAttributes<br>
Session에 data를 넣을 때 쓰는 Annotation이다.<br>
@SessionAttributes("name")이라고 하면 Model에 key값이 "name"으로 있는 값은 자동으로 세션에도 저장되게 한다.<br><br>
@Valid<br>
유효성 검증이 필요한 객체임을 지정한다.<br><br>
@InitBinder<br>
@Valid 애노테이션으로 유효성 검증이 필요하다고 한 객체를 가져오기전에 수행해야할 method를 지정한다.<br><br>
@RequestAttribute<br>
Request에 설정되어 있는 속성 값을 가져올 수 있다.<br><br>
@RequestBody<br>
요청이 온 데이터(JSON이나 XML형식)를 바로 Class나 model로 매핑하기 위한 Annotation이다.<br>
POST나 PUT, PATCH로 요청을 받을때에, 요청에서 넘어온 body 값들을 자바 타입으로 파싱해준다.<br>
HTTP POST 요청에 대해 request body에 있는 request message에서 값을 얻어와 매핑한다.<br>
RequestData를 바로 Model이나 클래스로 매핑한다.<br>
이를테면 JSON 이나 XML같은 데이터를 적절한 messageConverter로 읽을 때 사용하거나 POJO 형태의 데이터 전체로 받는 경우에 사용한다.<br><br>
@RequestHeader<br>
Request의 header값을 가져올 수 있다. 메소드의 파라미터에 사용한다.<br><br>
@RequestParam<br>
@PathVariable과 비슷하다.<br>
request의 parameter에서 가져오는 것이다. method의 파라미터에 사용된다.<br>
?moviename=thepurge 와 같은 쿼리 파라미터를 파싱해준다.<br>
HTTP GET 요청에 대해 매칭되는 request parameter 값이 자동으로 들어간다.<br>
url 뒤에 붙는 parameter 값을 가져올 때 사용한다.<br>
@RequestParam 어노테이션의 괄호 안의 문자열이 전달 인자 이름(실제 값을 표시)이다.<br><br>
@RequestPart<br>
Request로 온 MultipartFile을 바인딩해준다.<br><br>
@ResponseBody<br>
HttpMessageConverter를 이용하여 JSON 혹은 xml 로 요청에 응답할수 있게 해주는 Annotation이다.<br>
view가 아닌 JSON 형식의 값을 응답할 때 사용하는 Annotation으로 문자열을 리턴하면 그 값을 http response header가 아닌 response body에 들어간다.<br>
이미 RestController Annotation이 붙어 있다면, 쓸 필요가 없다.<br>
허나 그렇지 않은 단순 컨트롤러라면, HttpResponse로 응답 할 수 있게 해준다.<br>
만약 객체를 return하는 경우 JACKSON 라이브러리에 의해 문자열로 변환되어 전송된다.<br>
context에 설정된 viewResolver를 무시한다고 보면된다.<br><br>
@PathVariable<br>
method parameter 앞에 사용하면서 해당 URL에서 {특정값}을 변수로 받아 올 수 있다.<br>
HTTP 요청에 대해 매핑되는 request parameter 값이 자동으로 Binding 된다.<br>
uri에서 각 구분자에 들어오는 값을 처리해야 할 때 사용한다.<br>
REST API에서 값을 호출할 때 주로 많이 사용한다.<br><br>
@ExceptionHandler(ExceptionClassName.class)<br>
해당 클래스의 예외를 캐치하여 처리한다.<br><br>
@ControllerAdvice<br>
Class 위에 ControllerAdvice를 붙이고 어떤 예외를 잡아낼 것인지는 각 메소드 상단에 + @ExceptionHandler(예외클래스명.class)를 붙여서 기술한다.<br><br>
@RestControllerAdvice<br>
@ControllerAdvice + @ResponseBody다.<br><br>
@ResponseStatus<br>
사용자에게 원하는 response code와 reason을 return해주는 Annotation이다.<br>
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "my page URL + changed..") => 예외처리 함수 앞에 사용한다.<br><br>
@EnableEurekaServer<br>
Eureka 서버로 만들어준다.<br><br>
@EnableDiscoveryClient<br>
Eureka 서버에서 관리될 수 있는 클라이언트 임을 알려주기위한 Annotation이다.<br><br>
@Transactional<br>
데이터베이스 트랜잭션을 설정하고 싶은 method에 Annotation을 적용하면 method 내부에서 일어나는 데이터베이스 로직이 전부 성공하게되거나 데이터베이스 접근중 하나라도 실패하면 다시 롤백할 수 있게 해주는 Annotation이다.<br>
@Transaction(readOnly=true, rollbackFor=Exception.class)에서 readOnly는 읽기전용임을 알리고 rollbackFor는 해당 Exception이 생기면 롤백하라는 뜻이다.<br>
@Transaction(noRollbackFor=Exception.class)는 해당 Exception이 나타나도 롤백하지 말라는 뜻이다.<br>
@Transaction(timeout = 10)은 10초안에 해당 로직을 수행하지 못하면 롤백하라는 뜻이다.<br>
메소드 내에서 Exception이 발생하면 해당 메소드에서 이루어진 모든 DB 작업을 초기화한다.<br>
save 메소드를 통해서 10개를 등록해야 하는데 5번째에서 Exception이 발생하면 앞에 저장된 4개 까지 모두 롤백한다.<br>
정확히 얘기하면, 이미 넣은걸 롤백시키는건 아니며, 모든 처리가 정상적으로 됐을때만 DB에 커밋하며 그렇지 않은 경우엔 커밋하지 않는 것이다.<br>
비지니스 로직과 트랜잭션 관리는 대부분 Service에서 관리한다.<br>
따라서 일반적으로 DB 데이터를 등록/수정/삭제 하는 Service 메소드는 @Transactional를 필수적으로 가져간다.<br><br>
@Cacheable<br>
method 앞에 지정하면 해당 method를 최초에 호출하면 캐시에 적재하고 다음부터는 동일한 method 호출이 있을 때 캐시에서 결과를 가져와서 return하므로 method 호출 횟수를 줄여주는 Annotation이다.<br>
주의할 점은 입력이 같으면 항상 출력이 같은 method(=순수 함수)에 적용해야한다.<br>
그런데 또 항상 같은 값만 뱉어주는 메서드에 적용하려면 조금 아쉬울 수 있다.<br>
따라서 메서드 호출에 사용되는 자원이 많고 자주 변경되지 않을 때 사용하고 나중에 수정되면 캐시를 없애는 방법을 선택할 수 있다.<br><br>
@CachePut<br>
캐시를 업데이트하기 위해서 method를 항상 실행하게 강제하는 Annotation 이다.<br>
해당 Annotation이 있으면 method 호출을 항상한다. 그러므로 @Cacheable과 상충되어 같이 사용하면 안된다.<br><br>
@CacheEvict<br>
캐시에서 데이터를 제거하는 트리거로 동작하는 method에 붙이는 Annotation이다.<br>
캐시된 데이터는 언제가는 지워져야한다. 그러지 않으면 결과값이 변경이 일어났는데도 기존의 데이터(캐시된 데이터)를 불러와서 오류가 발생할 수 있다.<br>
물론 캐시 설정에서 캐시 만료시간을 줄 수도 있다.<br>
allEntries는 전체 캐시를 지울지 여부를 선택하는 것이다.<br><br>
@CacheConfig<br>
클래스 레벨에서 공통의 캐시설정을 공유하는 기능이다.<br><br>
@Scheduled<br>
Linux의 crontab처럼 정해진 시간에 실행해야하는 경우에 사용한다.<br>
@Scheduled(cron = "0 0 07 * * ?") : "초 분 시 일 월 요일 년(선택)에 해당 메서드 호출<br>
