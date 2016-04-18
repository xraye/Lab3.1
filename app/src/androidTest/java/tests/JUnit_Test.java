package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.xraye.lab31.MainActivity;
import com.example.xraye.lab31.R;

/**
 * Created by xraye on 4/18/2016.
 */
public class JUnit_Test extends ActivityInstrumentationTestCase2{

    MainActivity mainActivity;
    public JUnit_Test(){

        super(MainActivity.class);

    }

    public void test_first()
    {
        mainActivity = (MainActivity) getActivity();

        int result;
        result = mainActivity.sum(1,2);
        assertEquals(3, result);
        result = mainActivity.sum(-1,-2);
        assertEquals(-3, result);

        result = mainActivity.sum(-1,2);
        assertEquals(1, result);
        result = mainActivity.sum(1,-2);
        assertEquals(-1, result);

        result = mainActivity.sum(0,0);
        assertEquals(0, result);
        result = mainActivity.sum(1,0);
        assertEquals(1, result);

        //overflow...

    }
}
