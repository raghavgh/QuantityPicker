
/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

 package com.example.paliw.justjava;



         import android.os.Bundle;
         import android.os.Message;
         import android.support.v7.app.AppCompatActivity;
         import android.view.View;
         import android.widget.TextView;
         import android.widget.Toast;

         import org.w3c.dom.Text;

         import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
int NumberOfCoffee = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*tHis method will increase the value of number of coffee dependent on how many times a user tap this button*/
    public void increament(View view){
        NumberOfCoffee++;
        display(NumberOfCoffee);
        displayPrice(NumberOfCoffee*5 + NumberOfCoffee*2);
    }
    /*This method wil decrease as same as increment*/
    public void decrement(View view){
        if(NumberOfCoffee>=2){
            NumberOfCoffee--;
            display(NumberOfCoffee);
            displayPrice(NumberOfCoffee*5 + NumberOfCoffee*2);
        }
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price);
        priceTextView.setText(message);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String Message = "Total: $ " + NumberOfCoffee*7 + "\n";
        Message += "Thank you!";
        displayMessage(Message);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity);
        quantityTextView.setText("" + number);
    }
    public void displayPrice(int n){
        TextView p = (TextView) findViewById(R.id.price);
        p.setText(NumberFormat.getCurrencyInstance().format(n));
    }
}