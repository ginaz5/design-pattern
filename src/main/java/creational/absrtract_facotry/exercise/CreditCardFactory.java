package creational.absrtract_facotry.exercise;

//AbstractFactory - factory of factory methods
public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		if(creditScore > 650) {
			return new AmexFactory();
		}
		else {
			return new VisaFactory();
		}
	}

	public abstract CreditCard getCreditCard(CardType cardType);

	// each credit card has its own unique validator
	public abstract Validator getValidator(CardType cardType);

}
