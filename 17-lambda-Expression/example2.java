//todo                    Parameterized lambda expression 

/*
interface Greeting {
    void sayHello(String name);
}

public class Main {
    public static void main(String[] args) {
        
        Greeting g = (name) -> { 
            System.out.println("Hello " + name); 
        };
        
        g.sayHello("Ramesh"); // Output: Hello Ramesh
    }
}
*/  

//todo                      Explanation 

/*
!  lambda — One Rule:
? (parameter name) -> { method body }
      ↑                    ↑
*  just a name!         what to do!

Call panna pothu → actual value pass pannuva!
g.sayHello("Ramesh"); ← here only "Ramesh"!

?  Even simpler — 3 lines:
*  Lambda define  → parameter NAME only!
*  Lambda body    → what to DO!
*  Lambda call    → actual VALUE pass!

!   Real comparison:
java// Normal method:
void sayHello(String name)  ← name only
sayHello("Ramesh")          ← value here

 Lambda — SAME RULE!
(name) -> { ... }           ← name only  
g.sayHello("Ramesh")        ← value here

!  Lambda = normal method — just shorter! Same rules apply!


Note-a save pannitiya? 😄
Next — Exception Handling! Last important OOP topic da — finish panniduvom! 🚀


*/