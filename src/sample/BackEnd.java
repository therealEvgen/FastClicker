package sample;

import javafx.scene.control.Button;

public class BackEnd
{
    private int clicks = 1;
    public Button button;
    public int time = 0;

    public void Click()
    {
        if (clicks == 1)
            button.setText("Clicked " + String.valueOf(clicks) + " time");
        else
            button.setText("Clicked " + String.valueOf(clicks) + " times");
        clicks++;
    }
    public int Timer()
    {
        double timer=(double)(System.nanoTime() - time)/(100000000);
        if(timer==10.0) {
            return -1;
        }
        return 0;
    }

}