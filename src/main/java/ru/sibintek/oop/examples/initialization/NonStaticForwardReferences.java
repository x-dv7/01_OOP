package main.java.ru.sibintek.oop.examples.initialization;

public class NonStaticForwardReferences {

	   {                                    // (1) Нестатический блок инициализации.
	      nsf1 = 10;                        // (2) ОК. Присвоение nsf1 разрешено.
	      nsf1 = sf1;                       // (3) OK. Доступ к статическому полю в нестатическом контексте.
	      // int a = 2 * nsf1;              // (4) Не ОК. Операция чтения до объявления.
	      var b = nsf1 = 20;                // (5) ОК. Присваивание nsf1 разрешено.
	      int c = this.nsf1;                // (6) ОК. Доступ с помощью  this.
	   }

	   int nsf1 = nsf2 = 30;                // (7) Нестатическое поле. Присвоение nsf2 разрешено.
	   int nsf2;                            // (8) Нестатическое поле.
	   static int sf1 = 5;                  // (9) Статическое поле.

	   {                                    // (10) Нестатический блок инициализации.
	      int d = 2 * nsf1;                 // (11) OK. Операция чтения после объявления.
	      var e = nsf1 = 50;                // (12) OK. Присваивание nsf1 разрешено.
	   }


	   public static void main(String[] args) {
	      NonStaticForwardReferences objRef = new NonStaticForwardReferences () ;
	      System.out.println("nsf1: " + objRef.nsf1) ;
	      System.out.println("nsf2: " + objRef.nsf2);
	   }
	}
