package badebaba.myapplication.RecyclerViews;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import badebaba.myapplication.R;


/**
 * Created by monty on 15/9/16.
 */
public class ButtonViewHolder extends CarViewholder {

    Button bottombutton;
    EditText comment;

    public ButtonViewHolder(View itemView) {
        super(itemView);
        bottombutton = (Button) itemView.findViewById(R.id.button);
        comment = (EditText) itemView.findViewById(R.id.comment);


    }
}
