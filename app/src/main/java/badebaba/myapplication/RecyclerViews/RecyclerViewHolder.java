package badebaba.myapplication.RecyclerViews;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import badebaba.myapplication.POJO.Staff;
import badebaba.myapplication.R;


/**
 * Created by monty on 1/9/16.
 */
public class RecyclerViewHolder extends CarViewholder {

    TextView staff;
    LinearLayout visible;
    // Button tv2;
    //Adding buttons for the rating questions feedback
    //imageview onclick should toast a message about the opening of activity for feedback
    //feedback should submit the data
    Button b01, b02, b03, b04, b05, b11, b12, b13, b14, b15, b21, b22, b23, b24, b25;
    ImageView imageView;
    //RatingBar ratingBar;
    LinearLayout linearLayout;
    //  Firebase mref;
    Staff value = new Staff();
    //Adding questions
    TextView q1, q2, q3;


    public RecyclerViewHolder(final View itemView) {
        super(itemView);

        // mref = new Firebase("https://tscf-b4925.firebaseio.com/stafffeedback/");
        staff = (TextView) itemView.findViewById(R.id.list_title);
        visible = (LinearLayout) itemView.findViewById(R.id.visible);
        imageView = (ImageView) itemView.findViewById(R.id.list_avatar);
        staff.setTextColor(Color.BLACK);
        q1 = (TextView) itemView.findViewById(R.id.staffq1);
        q2 = (TextView) itemView.findViewById(R.id.staffq2);
        q3 = (TextView) itemView.findViewById(R.id.staffq3);
        // ratingBar = (RatingBar) itemView.findViewById(R.id.rate);
        linearLayout = (LinearLayout) itemView.findViewById(R.id.invisiblelinearlayout);
        linearLayout.setVisibility(View.INVISIBLE);
        b01 = (Button) itemView.findViewById(R.id.stb01);
        b02 = (Button) itemView.findViewById(R.id.stb02);
        b03 = (Button) itemView.findViewById(R.id.stb03);
        b04 = (Button) itemView.findViewById(R.id.stb04);
        b05 = (Button) itemView.findViewById(R.id.stb05);
        b11 = (Button) itemView.findViewById(R.id.stb11);
        b12 = (Button) itemView.findViewById(R.id.stb12);
        b13 = (Button) itemView.findViewById(R.id.stb13);
        b14 = (Button) itemView.findViewById(R.id.stb14);
        b15 = (Button) itemView.findViewById(R.id.stb15);
        b21 = (Button) itemView.findViewById(R.id.stb21);
        b22 = (Button) itemView.findViewById(R.id.stb22);
        b23 = (Button) itemView.findViewById(R.id.stb23);
        b24 = (Button) itemView.findViewById(R.id.stb24);
        b25 = (Button) itemView.findViewById(R.id.stb25);


        View.OnClickListener clicklistener0 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visible.setVisibility(View.INVISIBLE);
                Toast.makeText(view.getContext(), "Layout is made visible", Toast.LENGTH_SHORT).show();
                linearLayout.setVisibility(View.VISIBLE);
            }
        };

        View.OnClickListener clicklistener1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.stb01:
                        if (b04.getBackground() != null || b02.getBackground() != null || b03.getBackground() != null
                                || b05.getBackground() != null) {
                            b04.setBackgroundResource(R.color.standardwhite);
                            b02.setBackgroundResource(R.color.standardwhite);
                            b03.setBackgroundResource(R.color.standardwhite);
                            b05.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b01.setBackgroundResource(R.drawable.fill);
                        b01.setFocusableInTouchMode(true);
                        // tv1.setBackgroundColor(Color.BLUE);
                        value.setA1(b01.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.stb02:
                        if (b01.getBackground() != null || b04.getBackground() != null || b03.getBackground() != null
                                || b05.getBackground() != null) {
                            b01.setBackgroundResource(R.color.standardwhite);
                            b04.setBackgroundResource(R.color.standardwhite);
                            b03.setBackgroundResource(R.color.standardwhite);
                            b05.setBackgroundResource(R.color.standardwhite);
                        }
                      /*
                        b01.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        b02.setBackgroundResource(R.drawable.fill);

                        // b02.setTextColor(Color.BLUE);
                        b02.setFocusableInTouchMode(true);
                        //  tv2.setBackgroundColor(Color.BLUE);
                        value.setA1(b02.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb03:
                        if (b01.getBackground() != null || b02.getBackground() != null || b04.getBackground() != null
                                || b05.getBackground() != null) {
                            b01.setBackgroundResource(R.color.standardwhite);
                            b02.setBackgroundResource(R.color.standardwhite);
                            b04.setBackgroundResource(R.color.standardwhite);
                            b05.setBackgroundResource(R.color.standardwhite);
                        }
                       /* b01.setTextColor(Color.BLACK);
                        b02.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b03.setTextColor(Color.BLUE);
                        b03.setBackgroundResource(R.drawable.fill);
                        b03.setFocusableInTouchMode(true);
                        // tv3.setBackgroundColor(Color.BLUE);
                        value.setA1(b03.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb04:
                        if (b01.getBackground() != null || b02.getBackground() != null || b03.getBackground() != null
                                || b05.getBackground() != null) {
                            b01.setBackgroundResource(R.color.standardwhite);
                            b02.setBackgroundResource(R.color.standardwhite);
                            b03.setBackgroundResource(R.color.standardwhite);
                            b05.setBackgroundResource(R.color.standardwhite);
                        }
                       /* b01.setTextColor(Color.BLACK);
                        b02.setTextColor(Color.BLACK);
                        b03.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */

                        b04.setBackgroundResource(R.drawable.fill);
                        // b04.setTextColor(Color.BLUE);
                        b04.setFocusableInTouchMode(true);
                        // tv4.setBackgroundColor(Color.BLUE);
                        value.setA1(b04.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb05:
                        if (b01.getBackground() != null || b02.getBackground() != null || b03.getBackground() != null
                                || b05.getBackground() != null) {
                            b01.setBackgroundResource(R.color.standardwhite);
                            b02.setBackgroundResource(R.color.standardwhite);
                            b03.setBackgroundResource(R.color.standardwhite);
                            b04.setBackgroundResource(R.color.standardwhite);
                        }
                       /* b01.setTextColor(Color.BLACK);
                        b02.setTextColor(Color.BLACK);
                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK); */
                        b05.setBackgroundResource(R.drawable.fill);
                        // b05.setTextColor(Color.BLUE);
                        b05.setFocusableInTouchMode(true);
                        // tv5.setBackgroundColor(Color.BLUE);
                        value.setA1(b05.getText().toString());
                        // b5.setBackgroundColor(Color.BLUE);
                        break;
                    default:
                        value.setA1("0");
                }
                Toast.makeText(view.getContext(), "Rating set : " + value.getA1(), Toast.LENGTH_SHORT).show();

            }
        };

        View.OnClickListener clicklistener2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.stb11:
                        if (b14.getBackground() != null || b12.getBackground() != null || b13.getBackground() != null
                                || b15.getBackground() != null) {
                            b14.setBackgroundResource(R.color.standardwhite);
                            b12.setBackgroundResource(R.color.standardwhite);
                            b13.setBackgroundResource(R.color.standardwhite);
                            b15.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b11.setBackgroundResource(R.drawable.fill);
                        value.setA2(b11.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.stb12:
                        if (b14.getBackground() != null || b11.getBackground() != null || b13.getBackground() != null
                                || b15.getBackground() != null) {
                            b14.setBackgroundResource(R.color.standardwhite);
                            b11.setBackgroundResource(R.color.standardwhite);
                            b13.setBackgroundResource(R.color.standardwhite);
                            b15.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b12.setBackgroundResource(R.drawable.fill);
                        value.setA2(b12.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb13:
                        if (b14.getBackground() != null || b12.getBackground() != null || b11.getBackground() != null
                                || b15.getBackground() != null) {
                            b14.setBackgroundResource(R.color.standardwhite);
                            b12.setBackgroundResource(R.color.standardwhite);
                            b11.setBackgroundResource(R.color.standardwhite);
                            b15.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b13.setBackgroundResource(R.drawable.fill);
                        value.setA2(b13.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb14:
                        if (b11.getBackground() != null || b12.getBackground() != null || b13.getBackground() != null
                                || b15.getBackground() != null) {
                            b11.setBackgroundResource(R.color.standardwhite);
                            b12.setBackgroundResource(R.color.standardwhite);
                            b13.setBackgroundResource(R.color.standardwhite);
                            b15.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b14.setBackgroundResource(R.drawable.fill);
                        value.setA2(b14.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb15:
                        if (b14.getBackground() != null || b12.getBackground() != null || b13.getBackground() != null
                                || b11.getBackground() != null) {
                            b14.setBackgroundResource(R.color.standardwhite);
                            b12.setBackgroundResource(R.color.standardwhite);
                            b13.setBackgroundResource(R.color.standardwhite);
                            b11.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b15.setBackgroundResource(R.drawable.fill);
                        value.setA2(b15.getText().toString());
                        // b5.setBackgroundColor(Color.BLUE);
                        break;
                    default:
                        value.setA2("0");
                }
                Toast.makeText(view.getContext(), "Rating set : " + value.getA2(), Toast.LENGTH_SHORT).show();

            }
        };

        View.OnClickListener clicklistener3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.stb21:
                        if (b24.getBackground() != null || b22.getBackground() != null || b23.getBackground() != null
                                || b25.getBackground() != null) {
                            b24.setBackgroundResource(R.color.standardwhite);
                            b22.setBackgroundResource(R.color.standardwhite);
                            b23.setBackgroundResource(R.color.standardwhite);
                            b25.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b21.setBackgroundResource(R.drawable.fill);
                        value.setA3(b21.getText().toString());

                        // b1.setBackgroundColor(Color.BLUE);
                        // b1.setCursorVisible(true);
                        break;
                    case R.id.stb22:
                        if (b24.getBackground() != null || b21.getBackground() != null || b23.getBackground() != null
                                || b25.getBackground() != null) {
                            b24.setBackgroundResource(R.color.standardwhite);
                            b21.setBackgroundResource(R.color.standardwhite);
                            b23.setBackgroundResource(R.color.standardwhite);
                            b25.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b22.setBackgroundResource(R.drawable.fill);
                        value.setA3(b22.getText().toString());
                        // b2.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb23:
                        if (b24.getBackground() != null || b22.getBackground() != null || b21.getBackground() != null
                                || b25.getBackground() != null) {
                            b24.setBackgroundResource(R.color.standardwhite);
                            b22.setBackgroundResource(R.color.standardwhite);
                            b21.setBackgroundResource(R.color.standardwhite);
                            b25.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b23.setBackgroundResource(R.drawable.fill);
                        // tv3.setBackgroundColor(Color.BLUE);
                        value.setA3(b23.getText().toString());
                        // b3.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb24:
                        if (b21.getBackground() != null || b22.getBackground() != null || b23.getBackground() != null
                                || b25.getBackground() != null) {
                            b21.setBackgroundResource(R.color.standardwhite);
                            b22.setBackgroundResource(R.color.standardwhite);
                            b23.setBackgroundResource(R.color.standardwhite);
                            b25.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b24.setBackgroundResource(R.drawable.fill);
                        value.setA3(b24.getText().toString());
                        // b4.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.stb25:
                        if (b24.getBackground() != null || b22.getBackground() != null || b23.getBackground() != null
                                || b21.getBackground() != null) {
                            b24.setBackgroundResource(R.color.standardwhite);
                            b22.setBackgroundResource(R.color.standardwhite);
                            b23.setBackgroundResource(R.color.standardwhite);
                            b21.setBackgroundResource(R.color.standardwhite);
                        }
                       /*
                        b02.setTextColor(Color.BLACK);

                        b03.setTextColor(Color.BLACK);
                        b04.setTextColor(Color.BLACK);
                        b05.setTextColor(Color.BLACK);
                        */
                        // b01.setTextColor(Color.BLUE);
                        b25.setBackgroundResource(R.drawable.fill);
                        value.setA3(b25.getText().toString());
                        // b5.setBackgroundColor(Color.BLUE);
                        break;
                    default:
                        value.setA3("0");
                }
                Toast.makeText(view.getContext(), "Rating set : " + value.getA3(), Toast.LENGTH_SHORT).show();

            }
        };


        visible.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               /*
                value.setStaffname(staff.getText().toString());
                value.setQ1(q1.getText().toString());
                value.setQ2(q2.getText().toString());
                value.setQ3(q3.getText().toString());
                mref.child("Staff").push().setValue(value);
                Toast.makeText(view.getContext(), "Your Staff Submission is Done", Toast.LENGTH_SHORT).show();
                */
                linearLayout.setVisibility(View.INVISIBLE);
            }
        });


        imageView.setOnClickListener(clicklistener0);
        b01.setOnClickListener(clicklistener1);
        b02.setOnClickListener(clicklistener1);
        b03.setOnClickListener(clicklistener1);
        b04.setOnClickListener(clicklistener1);
        b05.setOnClickListener(clicklistener1);
        b11.setOnClickListener(clicklistener2);
        b12.setOnClickListener(clicklistener2);
        b13.setOnClickListener(clicklistener2);
        b14.setOnClickListener(clicklistener2);
        b15.setOnClickListener(clicklistener2);
        b21.setOnClickListener(clicklistener3);
        b22.setOnClickListener(clicklistener3);
        b23.setOnClickListener(clicklistener3);
        b24.setOnClickListener(clicklistener3);
        b25.setOnClickListener(clicklistener3);


    }

}
