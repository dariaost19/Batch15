package class23;

import class20.Parent;

public class FinalKeyword {
    final double gravity=9.8;
   final double PI=3.14;
    final double lightSpeed=2997922458l;
   final void tryChangingGravity(){
     //   gravity=1.6; we are getting error as this variable marked final

    }

}
// if you put final keyword to method that is mean you can not override it
//if you put final keyword to variable you can not change it
//if you put final keyword to class that's mean you can not inherit from it.
class Child extends Parent{


}
