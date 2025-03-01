package service;

import static javafx.scene.input.KeyCode.L;

public interface Employee {

   String disp();
   default float piValues()
   {
      return 3.142f;
   }
}
