package tw.org.tnllc.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {

    private DatePicker firstDatePicker;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstDatePicker = (DatePicker) findViewById(R.id.firstDatePicker);
        firstDatePicker.updateDate(2017, 2-1, 18);

        button = (Button) findViewById(R.id.button);

        ButtonListener buttonListener = new ButtonListener();
        button.setOnClickListener(buttonListener);

    }

    class ButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            int y = firstDatePicker.getYear();
            int m= firstDatePicker.getMonth() + 1;
            int d = firstDatePicker.getDayOfMonth();
            Log.i("年", String.valueOf(y));
            Log.i("月", String.valueOf(m));
            Log.i("日", String.valueOf(d));
        }
    }

}
