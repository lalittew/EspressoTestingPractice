package jgarciabt.fizzbuzz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import jgarciabt.fizzbuzz.RockPaperScissorsLizardSpockHelper.DrawType;

public class FizzBuzzGameActivity extends AppCompatActivity {

    private Button fizzBuzzButton;
    private EditText inputEditText;
    private TextView fizzBuzzResultTextView;

    private GameController gameController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fizz_buzz);

        // FizzBuzz Views
        fizzBuzzButton = (Button) findViewById(R.id.fizz_buzz_button);
        inputEditText = (EditText) findViewById(R.id.number_input);
        fizzBuzzResultTextView = (TextView) findViewById(R.id.fizz_buzz_output);


        initialiseController();

        fizzBuzzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numberInput = inputEditText.getText().toString();

                if(numberInput.isEmpty()) {
                    fizzBuzzResultTextView.setText("No number!");
                } else {

                    int numberValue = Integer.parseInt(numberInput);
                    String result = gameController.getFizzBuzz(numberValue);
                    fizzBuzzResultTextView.setText(result);
                }

                inputEditText.setText("");
            }
        });
    }

    private void initialiseController() {

        FizzBuzzHelper fizzBuzzHelper = new FizzBuzzHelper();
        RockPaperScissorsLizardSpockHelper rockPaperScissorsLizardSpockHelper = new RockPaperScissorsLizardSpockHelper();

        gameController = new GameController(fizzBuzzHelper, rockPaperScissorsLizardSpockHelper);
    }
}
