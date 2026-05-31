/*

todo                    Diamond Problem — Deep Dive! 💎

! 1. Real Life Analogy First

? Imagine you ask both your dad and mom —
? "What should I eat tonight?"
? Dad says → "Eat rice!"
? Mom says → "Eat chapati!"
? Now YOU are confused — whom to follow? 😵
? That's exactly Diamond Problem da!


!  2. What is Diamond Problem?

        A
       / \
      B   C
       \ /
        D

? javaclass A {
?    void message() {
?        System.out.println("I am A!");
?    }
? }

*class B extends A {
*    void message() {
*        System.out.println("I am B!");
*    }
* }

todo class C extends A {
todo     void message() {
todo         System.out.println("I am C!");
todo     }
todo }

* ❌ Java doesn't allow this!

? class D extends B, C {
?     which message() to use?
?     B's message? or C's message?
?     Java gets confused! ❌
? }

!  Memory visualization:

        A.message() = "I am A!"
           /          \
B.message()="I am B!"  C.message()="I am C!"
           \          /
    D.message() = ??? 😵 CONFUSED!

todo  Java says — "I don't know which method to call!"
todo  So Java completely blocks multiple class inheritance! ❌


!  3. How Interface SOLVES this!
    javainterface B {
        void message(); // ❌ no body!
    }

    interface C {
        void message(); // ❌ no body!
    }

    class D implements B, C {
        !@Override
        public void message() {
            System.out.println("I am D!"); // ✅ D gives its OWN body!
        }
    }

?  Memory visualization:

     B.message() = no body!
          \
           D.message() = "I am D!" ✅ D decides itself!
          /
     C.message() = no body!

todo Interface has no body — so no confusion!
todo D must implement its own version — D decides! ✅

!   4. Step by Step — What Java does internally
java// When you write:
class D implements B, C {
    public void message() {
        System.out.println("I am D!");
    }
}

 todo           Java checks:

 ?  Step 1: Does B have message()? Yes — but no body!
 ?  Step 2: Does C have message()? Yes — but no body!
 ?  Step 3: Does D have message()? Yes — has body!
 ?  Step 4: Use D's message()! ✅ No confusion!

!  5. Comparison Table
*  SituationMultiple ClassesMultiple InterfacesMethods have body?✅ Yes — conflict!❌ No body — no conflict!Java allows?❌ No✅ YesWho decides method body?Nobody — confusion!Child class — always!Diamond problem?✅ Occurs❌ Never occurs

!  6. One Line to Remember Forever

* Classes have body — conflict happens!
* Interfaces have no body — child decides — no conflict!

!  7. Interview Answer — if asked

* "Java doesn't support multiple inheritance with classes because of the Diamond Problem — where two parent classes have the same method and the child class gets confused about which one to call. But with interfaces, since methods have no body, the child class must implement its own version — so no confusion occurs!"
* Adhe answer sollu — interviewer impress aaguvaan! 💪

*/