package pEnum02;

//p707
public enum SuperSmartSeverity {

	LOW("Low priority", 30) {

		@Override
		public double getProjectedCost() {
			// TODO Auto-generated method stub
			return 0;
		}

	},
	MEDIUM("Medium Priority", 15) {

		@Override
		public double getProjectedCost() {
			// TODO Auto-generated method stub
			return 0;
		}

	},
	HIGH("High Priority", 7) {
		public double getProjectedCost() {
			return 3000.0;
		}
	},
	URGENT("Urgent Priority", 1) {
		public double getProjectedCost() {
			return 5000.0;
		}
	};

	// Declare instance variables
	private String description;
	private int projectedTurnaroundDays;

	// Declare a private constructor
	private SuperSmartSeverity(String description, int projectedTurnaroundDays) {
		this.description = description;
		this.projectedTurnaroundDays = projectedTurnaroundDays;
	}

	// Declare a public method to get the turn around days
	public int getProjectedTurnaroundDays() {
		return projectedTurnaroundDays;
	}

	@Override
	public String toString() {
		return this.description;
		
	}

	// Provide getProjectedCost() abstract method, so all constants
	// override and provide implementation for it in their body
	public abstract double getProjectedCost();
}


//The following are new features in the SuperSmartSeverity enum type:
//• It has added an abstract method getProjectedCost() to return the projected cost of each
//type of severity.
//• It has a body for each constant that provides implementation for the getProjectedCost()
//method. Note that declaring an abstract method in an enum type forces you to provide a body
//for all its constants.
//• It has added another parameter to the constructor, which is a nicer name for the severity type.
//• It has overridden the toString() method in the Enum class. The toString() method in the
//Enum class returns the name of the constant. Your toString() method returns a brief and more
//intuitive name for each constant.
