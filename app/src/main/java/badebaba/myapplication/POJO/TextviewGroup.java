package badebaba.myapplication.POJO;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import badebaba.myapplication.R;

/**
 * Created by badebaba on 9/19/2016.
 */

public class TextviewGroup extends TextView {

    TextView tv1, tv2, tv3, tv4, tv5;
    TextView tq1, tq2;

    public TextviewGroup(Context context) {
        super(context);
    }

    public void grading(View view, TextView tv1, TextView tv2, TextView tv3, TextView tv4, TextView tv5) {
        switch (view.getId()) {
            //  case tv1.getId


        }

    }
}

