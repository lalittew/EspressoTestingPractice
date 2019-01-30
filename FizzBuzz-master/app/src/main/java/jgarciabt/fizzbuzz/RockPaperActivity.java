package jgarciabt.fizzbuzz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import jgarciabt.fizzbuzz.RockPaperScissorsLizardSpockHelper.DrawType;

public class RockPaperActivity extends AppCompatActivity {

    private Button fizzBuzzButton;
    private Button rockPaperButton;
    private EditText inputEditText;
    private TextView fizzBuzzResultTextView;
    private Spinner playerOneSpinner;
    private Spinner playerTwoSpinner;
    private TextView rockPaperResultTextView;

    private GameController gameController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fizz_buzz);


        // Rock-Paper-Scissors-Lizard-Spock Views
        rockPaperButton = (Button) findViewById(R.id.rock_paper_button);
        playerOneSpinner = (Spinner) findViewById(R.id.player_1);
        playerTwoSpinner = (Spinner) findViewById(R.id.player_2);
        rockPaperResultTextView = (TextView) findViewById(R.id.rock_paper_output);

        initialiseController();

        rockPaperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] options = getResources().getStringArray(R.array.rock_paper_options);

                DrawType playerOneOption = DrawType.valueOf(options[playerOneSpinner.getSelectedItemPosition()]);
                DrawType playerTwoOption = DrawType.valueOf(options[playerTwoSpinner.getSelectedItemPosition()]);

                String result = gameController.whoWins(playerOneOption, playerTwoOption);
                rockPaperResultTextView.setText(result);
            }
        });
    }

    private void initialiseController() {

        FizzBuzzHelper fizzBuzzHelper = new FizzBuzzHelper();
        RockPaperScissorsLizardSpockHelper rockPaperScissorsLizardSpockHelper = new RockPaperScissorsLizardSpockHelper();

        gameController = new GameController(fizzBuzzHelper, rockPaperScissorsLizardSpockHelper);
    }
}
