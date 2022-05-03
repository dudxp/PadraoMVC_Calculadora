package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CalcModel;
import view.CalcView;

public class CalcController {
    private CalcModel model;
    private CalcView view;
    
    public CalcController(CalcView view, CalcModel model)
    {
        this.view = view;
        this.model = model;
        
        this.view.getbtnAdd().addActionListener(new CalcListener());
    }
    
    class CalcListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int num1 = Integer.parseInt(view.getTxtNumb1().getText());
            int num2 = Integer.parseInt(view.getTxtNumb2().getText());

            model.somar(num1, num2);
            view.setlblResultado(Integer.toString(model.getResultado()));
        }
    }
}
