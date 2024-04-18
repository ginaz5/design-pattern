package creational.prototype;

import creational.prototype.exercise.Record;

import java.util.List;

public class Statement implements Cloneable {

	private String sql;
	private List<String> parameters;
	private Record record;

	public Statement(String sql, List<String> parameters, Record record) {
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}

	public Statement clone() {
//		by default, the clone() method in Java performs a shallow copy of the object
		try {
			Statement cloned = (Statement) super.clone();
			// deep copy
			cloned.setRecord(this.record.clone());
			return cloned;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public Record getRecord() {
		return record;
	}

	public String getSql() {
		return sql;
	}

	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}
}