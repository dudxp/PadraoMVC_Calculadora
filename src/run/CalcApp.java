package run;

import view.CalcView;
import model.CalcModel;
import controller.CalcController;

public class CalcApp {
    public static void main(String args[]) {
        CalcView calcView = new CalcView();
        
        CalcModel calcModel = new CalcModel();
        
        CalcController calcController = new CalcController(calcView, calcModel);
        
        calcView.setVisible(true);
    }
}

