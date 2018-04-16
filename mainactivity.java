package com.example.madhuri.quiz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This app is a quiz for general knowledge and shows the players score
 *
 */
public class MainActivity extends AppCompatActivity {

    int score = 0; // keeps the final score of the player
    int count = 0; // keeps how many boxes are checked at question 4
    int count2 = 0; // keeps how many boxes are checked at question 5
    int points = 0; //internal points to add to the final score

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit answer button is clicked.
     * calls ALL the other methods in this file with the id's of the activity_main.xml
     * calculates the points gained and prints the final score as a Toast
     */
    public void submitAnswers(View view) {

        score = 0; // avoid keeping score bug


        EditText nameField = findViewById(R.id.player);
        String name = nameField.getText().toString();
        EditText answer = findViewById(R.id.question4);
        EditText answerNext = findViewById(R.id.question5);


        onRadioButtonClicked(findViewById(R.id.true_1));
        onRadioButtonClicked(findViewById(R.id.false_1));
        onRadioButtonClicked(findViewById(R.id.true_2));
        onRadioButtonClicked(findViewById(R.id.false_2));
        onCheckboxClicked(findViewById(R.id.me), findViewById(R.id.jsp), findViewById(R.id.ao), findViewById(R.id.po));

        textCompare(answer);
        textCompare(answerNext);
        onRadioButtonClicked(findViewById(R.id.true_6));
        onRadioButtonClicked(findViewById(R.id.false_6));
        onRadioButtonClicked(findViewById(R.id.true_7));
        onRadioButtonClicked(findViewById(R.id.false_7));
        onCheckboxClicked2(findViewById(R.id.jcm), findViewById(R.id.mf), findViewById(R.id.ldv), findViewById(R.id.mc));
        onRadioButtonClicked(findViewById(R.id.true_9));
        onRadioButtonClicked(findViewById(R.id.false_9));
        onRadioButtonClicked(findViewById(R.id.true_10));
        onRadioButtonClicked(findViewById(R.id.false_10));

        /**
         * This variable keeps the final message that compounds the name of the player, the score
         * and a message
         * score 0-4 :Don't worry! Try again!
         * score 5-6 :Need a bit more practice!!
         * score 7-8 :Well Done!!
         * score 9-10 :Excellent!!
         */
        String finalScore = name + " Your final score is : " + score + " out of 10";

        if (score < 5) {
            Toast.makeText(getApplicationContext(), finalScore + " Don't worry! Try again!", Toast.LENGTH_SHORT).show();
        } else if (score < 7) {
            Toast.makeText(getApplicationContext(), finalScore + " Need a bit more practice!!", Toast.LENGTH_SHORT).show();
        } else if (score < 9) {
            Toast.makeText(getApplicationContext(), finalScore + " Well Done!!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), finalScore + " Excellent!!", Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * True - False Questions
     * This method compares which radiobuttons  are clicked by the user to the correct answers
     * if correct is checked player gets a point
     */

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?

        boolean checked = ((RadioButton) view).isChecked();


        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.true_1:
                if (checked) {
                    score += 0;// wrong answer
                    break;
                }

            case R.id.false_1:
                if (checked) {
                    score += 1;
                    break;
                }

            case R.id.true_2:
                if (checked) {
                    score += 0;// wrong answer
                    break;
                }

            case R.id.false_2:
                if (checked) {
                    score += 1;
                    break;
                }
            case R.id.true_6:
                if (checked) {
                    score += 0;// wrong answer
                    break;
                }

            case R.id.false_6:
                if (checked) {
                    score += 1;
                    break;
                }
            case R.id.true_7:
                if (checked) {
                    score += 1;
                    break;
                }

            case R.id.false_7:
                if (checked) {
                    score += 0;// wrong answer
                    break;
                }
            case R.id.true_9:
                if (checked) {
                    score += 1;
                    break;
                }

            case R.id.false_9:
                if (checked) {
                    score += 0; // wrong answer
                    break;
                }
            case R.id.true_10:
                if (checked) {
                    score += 0;// wrong answer
                    break;
                }

            case R.id.false_10:
                if (checked) {
                    score += 1;
                    break;
                }
        }
    }

    /**
     * Question 04
     * This method compares which checkboxes are clicked by the user to the correct answer
     * both correct boxes must be checked for the player to score a point
     */
    public void onCheckboxClicked(View view1, View view2, View view3, View view4) {
        // Is the view now checked?
        points = 0;
        boolean checked1 = ((CheckBox) view1).isChecked();
        // boolean checked2 = ((CheckBox) view2).isChecked();
        // boolean checked3 = ((CheckBox) view3).isChecked();
        boolean checked4 = ((CheckBox) view4).isChecked();

        if (checked1 && checked4) {
            points = 1;
        } else points = 0;


        score += points;
    }

    /**
     * Question 04
     * This method controls how many checkboxes will be checked by the user at checkbox questions
     * when a box is checked the counter (limit 2) increases by 1
     * when a box is unchecked the counter decreases by 1
     */
    public void checkedBoxes(View view) {

        final CheckBox checkBox1 = findViewById(R.id.me);
        final CheckBox checkBox2 = findViewById(R.id.jsp);
        final CheckBox checkBox3 = findViewById(R.id.ao);
        final CheckBox checkBox4 = findViewById(R.id.po);

        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.me:
                if (checked) {
                    count += 1;
                    break;
                } else {
                    count--;
                }

            case R.id.jsp:
                if (checked) {
                    count += 1;
                    break;
                } else {
                    count--;
                }

            case R.id.ao:
                if (checked) {
                    count += 1;
                    break;
                } else {
                    count--;
                }

            case R.id.po:
                if (checked) {
                    count += 1;
                    break;
                } else {
                    count--;
                }

        }


        if (count > 2) {
            Toast.makeText(getApplicationContext(), "Only 2 answers are correct!!!", Toast.LENGTH_SHORT).show();


            if (checkBox1.isChecked()) {
                checkBox1.setChecked(false);
                count--;
            }
            if (checkBox2.isChecked()) {
                checkBox2.setChecked(false);
                count--;
            }
            if (checkBox3.isChecked()) {
                checkBox3.setChecked(false);
                count--;
            }
            if (checkBox4.isChecked()) {
                checkBox4.setChecked(false);
                count--;
            }
        }
    }

    /**
     * Question 05
     * This method compares which checkboxes are clicked by the user to the correct answer
     * both correct boxes must be checked for the player to score a point
     */


    public void onCheckboxClicked2(View view1, View view2, View view3, View view4) {
        // Is the view now checked?
        points = 0;
        boolean checked5 = ((CheckBox) view1).isChecked();
        boolean checked6 = ((CheckBox) view2).isChecked();
        //  boolean checked7 = ((CheckBox) view3).isChecked();
        //  boolean checked8 = ((CheckBox) view4).isChecked();

        if (checked5 && checked6) {
            points = 1;
        } else points = 0;


        score += points;
    }

    /**
     * Question 05
     * This method controls how many checkboxes will be checked by the user at checkbox questions
     * when a box is checked the counter (limit 2) increases by 1
     * when a box is unchecked the counter decreases by 1
     */

    public void checkedBoxes2(View view) {

        final CheckBox checkBox5 = findViewById(R.id.jcm);
        final CheckBox checkBox6 = findViewById(R.id.mf);
        final CheckBox checkBox7 = findViewById(R.id.ldv);
        final CheckBox checkBox8 = findViewById(R.id.mc);

        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.jcm:
                if (checked) {
                    count2 += 1;
                    break;
                } else {
                    count2--;
                }

            case R.id.mf:
                if (checked) {
                    count2 += 1;
                    break;
                } else {
                    count2--;
                }

            case R.id.ldv:
                if (checked) {
                    count2 += 1;
                    break;
                } else {
                    count2--;
                }

            case R.id.mc:
                if (checked) {
                    count2 += 1;
                    break;
                } else {
                    count2--;
                }
        }


        if (count2 > 2) {
            Toast.makeText(getApplicationContext(), "Only 2 answers are correct!!!", Toast.LENGTH_SHORT).show();

            if (checkBox5.isChecked()) {
                checkBox5.setChecked(false);
                count2--;
            }
            if (checkBox6.isChecked()) {
                checkBox6.setChecked(false);
                count2--;
            }
            if (checkBox7.isChecked()) {
                checkBox7.setChecked(false);
                count2--;
            }
            if (checkBox8.isChecked()) {
                checkBox8.setChecked(false);
                count2--;
            }
        }
    }

    /**
     * This method compares the answer given by the player at Questions 4 and 5 to the correct answers
     * and gives a point if correct
     */

    private void textCompare(View view) {

        switch (view.getId()) {
            case R.id.question4:
                EditText answer = (EditText) findViewById(R.id.question4);
                if (answer.getText().toString().equals("Stack") || answer.getText().toString().equals("stack")) {
                    score += 1;
                    break;
                } else break;

            case R.id.question5:
                EditText answerNext = (EditText) findViewById(R.id.question5);
                if (answerNext.getText().toString().equals("heap") || answerNext.getText().toString().equals("Heap")) {
                    score += 1;
                    break;
                } else if (answerNext.getText().toString().equals("Graph") || answerNext.getText().toString().equals("Tree")) {
                    score += 1;
                    break;
                } else break;
        }
    }

    /**
     * This method creates a new instance of the game so a new player can use the app
     */
    public void newPlayer(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
