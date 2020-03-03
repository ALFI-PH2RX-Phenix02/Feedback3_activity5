package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnStart;
    Button btnQ1;
    Button btnQ2;
    Button btnQ3;
    Button btnQ4;
    Button btnQ5;
    Button btnQ6;
    Button btnQ7;
    Button btnQ8;
    Button btnQ9;
    Button btnQ10;
    Button btnQ11;
    Button btnQ12;
    Button btnFinish;
    String stringFirst;
    String stringSecond;
    String stringThree;
    String stringFour = "";
    String stringFive = "";
    String stringSix;
    String stringSeven;
    String stringEight;
    String stringNine;
    String stringTen;
    String stringEleven;
    String stringTwelve;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        btnStart = findViewById(R.id.btn_start);
        btnStart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_start:
                CheckBox checkBox = findViewById(R.id.cb_check);
                if (checkBox.isChecked()) {
                    setContentView(R.layout.question_one);
                    btnQ1 = findViewById(R.id.btn_Q1);
                    btnQ1.setOnClickListener(this);
                }
                break;
            case R.id.btn_Q1:
                RadioGroup radioGroup = findViewById(R.id.radio_groupQ1);
                if (radioGroup.getCheckedRadioButtonId() != -1) {
                    RadioButton radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
                    stringFirst = radioButton.getText().toString();
                    setContentView(R.layout.question_two);
                    btnQ2 = findViewById(R.id.btn_Q2);
                    btnQ2.setOnClickListener(this);
                }
                break;
            case R.id.btn_Q2:
                RadioGroup radioGroup1 = findViewById(R.id.radio_groupQ2);
                if (radioGroup1.getCheckedRadioButtonId() != -1) {
                    RadioButton radioButton = findViewById(radioGroup1.getCheckedRadioButtonId());
                    stringSecond = radioButton.getText().toString();
                    setContentView(R.layout.question_three);
                    btnQ3 = findViewById(R.id.btn_Q3);
                    btnQ3.setOnClickListener(this);
                }
                break;
            case R.id.btn_Q3:
                RadioGroup radioGroup2 = findViewById(R.id.radio_groupQ3);
                if (radioGroup2.getCheckedRadioButtonId() != -1) {
                    RadioButton radioButton = findViewById(radioGroup2.getCheckedRadioButtonId());
                    stringThree = radioButton.getText().toString();
                    setContentView(R.layout.question_four);
                    btnQ4 = findViewById(R.id.btn_Q4);
                    btnQ4.setOnClickListener(this);
                }
                break;
            case R.id.btn_Q4:
                CheckBox checkBox1 = findViewById(R.id.Q4_ck1);
                CheckBox checkBox2 = findViewById(R.id.Q4_ck2);
                CheckBox checkBox3 = findViewById(R.id.Q4_ck3);
                CheckBox checkBox4 = findViewById(R.id.Q4_ck4);
                CheckBox checkBox5 = findViewById(R.id.Q4_ck5);
                CheckBox checkBox6 = findViewById(R.id.Q4_ck6);
                CheckBox checkBox7 = findViewById(R.id.Q4_ck7);
                int flag = 0;
                if (checkBox1.isChecked()) {
                    stringFour = stringFour + "  " + checkBox1.getText().toString();
                    flag = 1;
                }
                if (checkBox2.isChecked()) {
                    stringFour = stringFour + "  " + checkBox2.getText().toString();
                    flag = 1;
                }
                if (checkBox3.isChecked()) {
                    stringFour = stringFour + "  " + checkBox3.getText().toString();
                    flag = 1;
                }
                if (checkBox4.isChecked()) {
                    stringFour = stringFour + "  " + checkBox4.getText().toString();
                    flag = 1;
                }
                if (checkBox5.isChecked()) {
                    stringFour = stringFour + "  " + checkBox5.getText().toString();
                    flag = 1;
                }
                if (checkBox6.isChecked()) {
                    stringFour = stringFour + "  " + checkBox6.getText().toString();
                    flag = 1;
                }
                if (checkBox7.isChecked()) {
                    stringFour = stringFour + "  " + checkBox7.getText().toString();
                    flag = 1;
                }
                if (flag == 1) {
                    setContentView(R.layout.question_five);
                    btnQ5 = findViewById(R.id.btn_Q5);
                    btnQ5.setOnClickListener(this);
                }
                break;
            case R.id.btn_Q5:
                CheckBox checkBox8 = findViewById(R.id.Q5_ck1);
                CheckBox checkBox9 = findViewById(R.id.Q5_ck2);
                CheckBox checkBox10 = findViewById(R.id.Q5_ck3);
                CheckBox checkBox11 = findViewById(R.id.Q5_ck4);
                CheckBox checkBox12 = findViewById(R.id.Q5_ck5);
                CheckBox checkBox13 = findViewById(R.id.Q5_ck6);
                CheckBox checkBox14 = findViewById(R.id.Q5_ck7);
                int flag5 = 0;
                if (checkBox8.isChecked()) {
                    stringFive = stringFive + "  " + checkBox8.getText().toString();
                    flag5 = 1;
                }
                if (checkBox9.isChecked()) {
                    stringFive = stringFive + "  " + checkBox9.getText().toString();
                    flag5 = 1;
                }
                if (checkBox10.isChecked()) {
                    stringFive = stringFive + "  " + checkBox10.getText().toString();
                    flag5 = 1;
                }
                if (checkBox11.isChecked()) {
                    stringFive = stringFive + "  " + checkBox11.getText().toString();
                    flag5 = 1;
                }
                if (checkBox12.isChecked()) {
                    stringFive = stringFive + "  " + checkBox12.getText().toString();
                    flag5 = 1;
                }
                if (checkBox13.isChecked()) {
                    stringFive = stringFive + "  " + checkBox13.getText().toString();
                    flag5 = 1;
                }
                if (checkBox14.isChecked()) {
                    stringFive = stringFive + "  " + checkBox14.getText().toString();
                    flag5 = 1;
                }
                if (flag5 == 1) {
                    setContentView(R.layout.question_six);
                    btnQ6 = findViewById(R.id.btn_Q6);
                    btnQ6.setOnClickListener(this);
                }
                break;
            case R.id.btn_Q6:
                EditText editText6 = findViewById(R.id.Q6_editText);
                if (!editText6.toString().isEmpty()) {
                    stringSix = editText6.getText().toString();
                    setContentView(R.layout.question_seven);
                    btnQ7 = findViewById(R.id.btn_Q7);
                    btnQ7.setOnClickListener(this);
                }
                break;
            case R.id.btn_Q7:
                RadioGroup radioGroup7 = findViewById(R.id.radio_groupQ7);
                if (radioGroup7.getCheckedRadioButtonId() != -1) {
                    RadioButton radioButton = findViewById(radioGroup7.getCheckedRadioButtonId());
                    stringSeven = radioButton.getText().toString();
                    setContentView(R.layout.question_eight);
                    btnQ8 = findViewById(R.id.btn_Q8);
                    btnQ8.setOnClickListener(this);
                }
                break;
            case R.id.btn_Q8:
                RadioGroup radioGroup8 = findViewById(R.id.radio_groupQ8);
                if (radioGroup8.getCheckedRadioButtonId() != -1) {
                    RadioButton radioButton = findViewById(radioGroup8.getCheckedRadioButtonId());
                    stringEight = radioButton.getText().toString();
                    setContentView(R.layout.question_nine);
                    btnQ9 = findViewById(R.id.btn_Q9);
                    btnQ9.setOnClickListener(this);
                }
                break;
            case R.id.btn_Q9:
                RadioGroup radioGroup9 = findViewById(R.id.radio_groupQ9);
                if (radioGroup9.getCheckedRadioButtonId() != -1) {
                    RadioButton radioButton = findViewById(radioGroup9.getCheckedRadioButtonId());
                    stringNine = radioButton.getText().toString();
                    setContentView(R.layout.question_ten);
                    btnQ10 = findViewById(R.id.btn_Q10);
                    btnQ10.setOnClickListener(this);
                }
                break;
            case R.id.btn_Q10:
                RadioGroup radioGroup10 = findViewById(R.id.radio_groupQ10);
                if (radioGroup10.getCheckedRadioButtonId() != -1) {
                    RadioButton radioButton = findViewById(radioGroup10.getCheckedRadioButtonId());
                    stringTen = radioButton.getText().toString();
                    setContentView(R.layout.question_eleven);
                    btnQ11 = findViewById(R.id.btn_Q11);
                    btnQ11.setOnClickListener(this);
                }
                break;
            case R.id.btn_Q11:
                RadioGroup radioGroup11 = findViewById(R.id.radio_groupQ11);
                if (radioGroup11.getCheckedRadioButtonId() != -1) {
                    RadioButton radioButton = findViewById(radioGroup11.getCheckedRadioButtonId());
                    stringEleven = radioButton.getText().toString();
                    setContentView(R.layout.question_twelve);
                    btnQ12 = findViewById(R.id.btn_Q12);
                    btnQ12.setOnClickListener(this);
                }
                break;
            case R.id.btn_Q12:
                RadioGroup radioGroup12 = findViewById(R.id.radio_groupQ12);
                if (radioGroup12.getCheckedRadioButtonId() != -1) {
                    RadioButton radioButton = findViewById(radioGroup12.getCheckedRadioButtonId());
                    stringTwelve = radioButton.getText().toString();
                    setContentView(R.layout.finish_survey);
                    btnFinish = findViewById(R.id.btn_finish);
                    btnFinish.setOnClickListener(this);
                }
                break;
            case R.id.btn_finish:
                setContentView(R.layout.activity_report);
                TextView textView1 = findViewById(R.id.info_1);
                textView1.setText(stringFirst);
                TextView textView2 = findViewById(R.id.info_2);
                textView2.setText(stringSecond);
                TextView textView3 = findViewById(R.id.info_3);
                textView3.setText(stringThree);
                TextView textView4 = findViewById(R.id.info_4);
                textView4.setText(stringFour);
                TextView textView5 = findViewById(R.id.info_5);
                textView5.setText(stringFive);
                TextView textView6 = findViewById(R.id.info_6);
                textView6.setText(stringSix);
                TextView textView7 = findViewById(R.id.info_7);
                textView7.setText(stringSeven);
                TextView textView8 = findViewById(R.id.info_8);
                textView8.setText(stringEight);
                TextView textView9 = findViewById(R.id.info_9);
                textView9.setText(stringNine);
                TextView textView10 = findViewById(R.id.info_10);
                textView10.setText(stringTen);
                TextView textView11 = findViewById(R.id.info_11);
                textView11.setText(stringEleven);
                TextView textView12 = findViewById(R.id.info_12);
                textView12.setText(stringTwelve);
                break;
            default:
                break;
        }
    }
}
