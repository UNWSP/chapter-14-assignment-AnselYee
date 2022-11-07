package assignment14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JVacationRental extends JFrame implements ItemListener{
	final int Parkside=600;
	final int Poolside=750;
	final int Lakeside=825;
	final int one=0;
	final int two=75;
	final int three=150;
	final int mealyes=200;
	final int mealno=0;
	int total=0;
    ButtonGroup location = new ButtonGroup();
    JCheckBox location1 = new JCheckBox("Parkside: $600",false);
    JCheckBox location2 = new JCheckBox("Poolside: $750",false);
    JCheckBox location3 = new JCheckBox("Lakeside: $825",false);

    ButtonGroup bedrooms = new ButtonGroup();
    JCheckBox oneBedroom = new JCheckBox("One bedroom: $0",false);
    JCheckBox twoBedrooms = new JCheckBox("Two bedrooms: $75",false);
    JCheckBox threeBedrooms = new JCheckBox("Three bedrooms: $150",false);

    ButtonGroup Meals = new ButtonGroup();
    JCheckBox meal = new JCheckBox("Meal: $200",false);
    JCheckBox nomeal = new JCheckBox("No meals",false);
    JLabel priceLabel = new JLabel("The total price is: $"+ total);
    JTextField totPrice = new JTextField(4);
    final int HEIGHT = 250;
    final int WIDTH = 700;

    public JVacationRental(){
        super("Vacation Rentals");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());

        add(location1);
        add(location2);
        add(location3);

        location.add(location1);
        location.add(location2);
        location.add(location3);

        add(oneBedroom);
        add(twoBedrooms);
        add(threeBedrooms);

        bedrooms.add(oneBedroom);
        bedrooms.add(twoBedrooms);
        bedrooms.add(threeBedrooms);

        add(meal);
        add(nomeal);
        add(priceLabel);
        add(totPrice);

        Meals.add(meal);
        Meals.add(nomeal);
        location1.addItemListener(this);
        location2.addItemListener(this);
        location3.addItemListener(this);
        oneBedroom.addItemListener(this);
        twoBedrooms.addItemListener(this);
        threeBedrooms.addItemListener(this);
        meal.addItemListener(this);
        nomeal.addItemListener(this);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public void itemStateChanged(ItemEvent event) {
    	Object source = event.getSource();
    	 int select = event.getStateChange();
    	if(source == location1) {
    		if(select == ItemEvent.SELECTED)
    		 total += Parkside;
    		else
    			total -= Parkside;}
    	else if(source == location2) {
    		if(select == ItemEvent.SELECTED)
    		 total += Poolside;
    		else
    			total -= Poolside;}
    	else if(source == location3) {
        	if(select == ItemEvent.SELECTED)
        	total += Lakeside;
    		else
    			total -= Lakeside;}
    	if(source == oneBedroom) {
    		if(select == ItemEvent.SELECTED)
    		 total += one;
    		else
    			total -= one;}
    	else if(source == twoBedrooms) {
            if(select == ItemEvent.SELECTED)
            	total += two;
    		else
    			total -= two;}
        else if(source == threeBedrooms) {
            if(select == ItemEvent.SELECTED)
                total += three;
    		else
    			total -= three;}
        if(source == meal) {
            if(select == ItemEvent.SELECTED)
                total += mealyes;
    		else
    			total -= mealyes;}
        else if(source == nomeal) {
            if(select == ItemEvent.SELECTED)
                total += mealno;
    		else
    			total -= mealno;}
        totPrice.setText("$" + total);
    }
    public static void main(String[] args){
    	JVacationRental aFrame = new JVacationRental();
    	final int WIDTH = 400;
    	final int HEIGHT = 400;
    	aFrame.setSize(WIDTH, HEIGHT);
    	aFrame.setVisible(true);
    }
}
