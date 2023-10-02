### \[Q\] Array vs List  
\[A\]

Array는 일반적으로 고정된 크기의 데이터 구조입니다. 배열을 생성할 때 크기를 지정하고, 그 크기만큼의 요소를 저장할 수 있습니다. 

배열 내의 각 요소는 인덱스를 통해 접근할 수 있으며, 인덱스는 일반적으로 0부터 시작합니다.

배열은 연속된 메모리 공간에 요소를 저장하므로 특정 인덱스의 요소에 빠르게 접근할 수 있습니다.

List는 동적으로 크기가 조정될 수 있는 데이터 구조입니다.

요소를 추가하거나 제거할 수 있으며, 크기를 자유롭게 조절할 수 있습니다.

리스트는 보통 다양한 데이터 유형을 포함할 수 있으며, 요소들은 순서대로 저장됩니다.

Array는 데이터의 추가/삭제가 느리며 데이터 조회가 빠르고, List는 데이터의 추가/삭제가 빠르며 데이터의 조회가 느립니다.

Array는 데이터의 추가공간이 필요없이 크기가 정해져있고, 추가적인 삽입/삭제 없이 검색을 필요로 할 때 유리합니다.

List는 데이터의 크기가 정해져있지 않고, 데이터의 삽입/삭제가 많은 경우 유리합니다.

<br>  
  
### \[Q\] Array vs ArrayList vs LinkedList  
\[A\]

Array는 고정된 크기의 데이터 구조로 생성할 때 크기를 지정하여 크기를 변경할 수 없습니다.

각 요소는 인덱스를 통해 빠르게 접근할 수 있으므로 검색 속도가 빠르나, 크기가 고정되기 때문에 요소를 추가하거나 삭제하기 어려우며, 크기를 조정하려면 새로운 배열을 할당하고 데이터를 복사해야 합니다.

배열은 메모리 공간을 연속적으로 사용하므로 메모리 할당이 효율적입니다.

ArrayList는 요소를 추가하거나 제거할 때 자동으로 크기가 조절되는 동적 배열 구조로 Array보다 데이터의 추가 및 삭제 작업이 편리하고, 인덱스를 통한 빠른 접근이 가능합니다.

LinkedList는 각 요소가 이전 요소와 다음 요소의 주소를 가지고 있는 연결 리스트 구조입니다.

데이터를 추가하거나 삭제할 때 요소의 연결만 변경하면 되므로, ArrayList보다 데이터 추가/삭제 작업이 빠르지만, 인덱스를 사용하여 요소에 접근하기 위해 처음부터 순차적으로 탐색해야 하기 때문에 시간이 오래걸립니다.

LinkedList는 각 요소의 메모리 할당이 분산되어 있으므로, 메모리 효율이 떨어질 수 있습니다.

Array는 크기가 고정되어 있고, 요소의 개수가 변경되지 않는 상황에 사용되고,   
ArrayList는 크기가 동적으로 조정되어야 하거나, 요소를 자주 추가/삭제해야 하는 상황에 사용됩니다.  
LinkedList는 데이터의 추가/삭제가 빈번하게 발생하며, 랜덤 액세스가 드물고 순차 액세스가 주로 사용되는 상황에 사용됩니다.  
  
<br>  
  
### \[Q\] Stack vs Queue  
\[A\]

스택(Stack)과 큐(Queue)는 데이터를 저장하고 관리하는 데 사용되는 두 가지 주요 추상 데이터 타입(ADT)입니다. 

스택(Stack)은 가장 최근에 추가된 요소가 가장 먼저 제거되는  Last-In, First-Out (LIFO) 데이터 구조입니다. 

스택의 주요 작업은 요소를 push(추가)하고 pop(제거)하는 것입니다. push 작업은 스택의 맨 위에 요소를 추가하고, pop 작업은 스택의 맨 위에 있는 요소를 제거합니다.

주로 뒤로 가기 버튼(웹 브라우저의 탐색 히스토리), 계산기의 후위 표기법 등에서 사용됩니다.

큐(Queue)는 가장 먼저 추가된 요소가 가장 먼저 제거되는 First-In, First-Out (FIFO) 데이터 구조입니다. 

큐의 주요 작업은  요소를 enqueue(추가)하고 dequeue(제거)하는 것입니다. enqueue 작업은 큐의 뒤에 요소를 추가하고, dequeue 작업은 큐의 앞에서 요소를 제거합니다.

주로  작업 대기열, 데이터 버퍼, 인쇄 대기열, BFS(너비 우선 탐색) 알고리즘 등에서 사용됩니다.  
  
<br>  
  
### \[Q\] 우선 순위 큐  
\[A\]

우선순위 큐(Priority Queue)는 먼저 들어오는 데이터가 아니라, 우선순위가 높은 데이터가 먼저 나가는 형태의 자료구조로 일반적으로 힙(Heap)을 이용하여 구현합니다.  
  
<br>  
  
### \[Q\] Heap  
\[A\]

힙(Heap)은 우선순위 큐를 위해 고안된 완전이진트리 형태의 자료구조로 여러 개의 값 중 최댓값 또는 최솟값을 찾아내는 연산을 빠르게 수행합니다. 

힙은 완전이진트리 형태로 이루어져 있고, 부모노드와 서브트리간 대소 관계가 성립됩니다. (반정렬 상태) 

이진탐색트리(BST)와 달리 중복된 값이 허용됩니다.

힙의 종류로는 최대힙 (Max Heap)과 최소힙 (Min Heap)이 있습니다.

최대힙 (Max Heap)은 부모 노드의 키 값이 자식 노드보다 크거나 같은 완전이진트리입니다.

최소힙 (Min Heap)은 부모 노드의 키 값이 자식 노드보다 작거나 같은 완전이진트리입니다.

**참고자료**
<br>  
힙설명 - [https://suyeon96.tistory.com/31](https://suyeon96.tistory.com/31)  
트리설명 - [https://velog.io/@dlgosla/CS-%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%EC%9D%B4%EC%A7%84-%ED%8A%B8%EB%A6%AC-Binary-Tree-vzdhb2sp](https://velog.io/@dlgosla/CS-%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%EC%9D%B4%EC%A7%84-%ED%8A%B8%EB%A6%AC-Binary-Tree-vzdhb2sp)
  
<br>  
  
### \[Q\] Tree  
\[A\]

트리(Tree)란 계층적인 구조를 나타내는 자료구조로, 스택(Stack)과 큐(Queue)와 같은 선형 구조와 달리 트리는 비선형 구조이며, 나무를 거꾸로 그린 형태입니다.

**트리용어**
-   **노드(node)**: 트리를 구성하는 기본 원소
-   **루트 노드(root node/root)**: 트리에서 부모가 없는 최상위 노드, 트리의 시작점
-   **부모 노드(parent node)**: 루트 노드 방향으로 직접 연결된 노드
-   **자식 노드(child node)**: 루트 노드 반대방향으로 직접 연결된 노드
-   **형제 노드(siblings node)**: 같은 부모 노드를 갖는 노드들
-   **리프 노드(leaf (node))/단말 노드(terminal node)**: 자식이 없는 노드
-   **간선(edge)**: 노드간의 연결
-   **레벨(level)**: 루트 노드(level=1)부터 노드까지 연결된 링크 수의 합
-   **높이(height)**: 가장 긴 루트 경로의 길이
-   **차수(degree)**: 각 노드의 자식의 개수
-   **트리의 차수(degree of tree)**: 트리의 최대 차수 = max\[deg1, deg2, ..., degn\]
-   **경로(path)**: 한 노드에서 다른 한 노드에 이르는 길 사이에 있는 노드들의 순서
-   **길이(length)**: 출발 노드에서 도착 노드까지 거치는 노드의 개수
-   **깊이(depth)**: 루트 경로의 길이
-   **크기(size)**: 노드의 개수
-   **너비(width)**: 가장 많은 노드를 갖고 있는 레벨의 크기
  
<br>  
  
### \[Q\] Hash Table란?  
\[A\]

해시 테이블이란 연관배열 구조를 이용하여 (Key, Value)로 데이터를 저장하는 자료구조로, 빠르게 데이터를 검색할 수 있는 자료구조입니다. 
  
<br>  
  
### \[Q\] Hash Map vs Hash Table  
\[A\]

해시함수를 사용하여 키를 해시값으로 매핑하고, 이 해시값을 색인(Index) 혹은 주소 삼아 데이터의 값(value)을 키와 함께 저장하는 자료구조를 해시 테이블(Hash Table) 혹은 해시맵(Hash Map)이라고 합니다. 

자바에서는 두 자료구조가 다르게 취급되는데, 자바에서의 Hashmap과 HashTable의 가장 큰 차이는 Thread-safe입니다. Hashtable의 모든 Data 변경 메소드는 syncronized로 선언되어 있어 메소드 호출 전 스레드간 동기화 락을 통해 멀티 쓰레드 환경에서 data의 무결성을 보장해줍니다.

하지만 HashMap의 경우 Thread-safe하지 않기 때문에 멀티 스레드 환경에서 동시에 객체의 data를 조작하는 경우 data가 보장되지 않을 수 있습니다.

다만 HashMap이 동기화를 지원하지 않는다하여 HashTable을 쓰는 것보다는 동기화가 필요하다면 ConcurrentHashMap을 사용하는 것이 더 좋은 방법이라고 알고 있습니다. 그이유는 HashTable은 Collection Framework이 나오기 이전부터 존재한 구형 버전이기 때문에 HashMap에 비해 느리다고 알고 있습니다.

또한 HashMap은 key에 null을 허용하지만 HashTable의 경우 key에 null을 허용하지 않습니다.  
  
<br>  
  
### \[Q\] BST(Binary Search Tree)란?  
\[A\]

이진 탐색 트리(Binary Search Tree, BST)란 왼쪽 자식은 부모보다 작고 오른쪽 자식은 부모보다 큰 이진 트리입니다.

중위순회(inorder traversal)를 하면, 오름차순으로 정렬된 순서로 Key값을 얻을 수 있습니다.

\*이진트리 (binary tree)란 모든 노드들이 둘 이하(0,1,2 개)의 자식을 가진 트리  
  
<br>