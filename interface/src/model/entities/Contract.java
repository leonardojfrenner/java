package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.service.Installment;

public class Contract {
	
	private Integer numberContract;
	private LocalDate dateContract;
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList<>();
	
	public Contract() {
	}
	
	public Contract(Integer numberContract, LocalDate dateContract, Double totalValue) {
		this.numberContract = numberContract;
		this.dateContract = dateContract;
		this.totalValue = totalValue;
	}

	

	public Integer getNumberContract() {
		return numberContract;
	}

	public void setNumberContract(Integer numberContract) {
		this.numberContract = numberContract;
	}

	public LocalDate getDateContract() {
		return dateContract;
	}

	public void setDateContract(LocalDate dateContract) {
		this.dateContract = dateContract;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	

	public List<Installment> getInstallments() {
		return installments;
	}

	@Override
	public String toString() {
		return "Contract: " + numberContract + ", dateContract: " + dateContract + ", totalValue: "
				+ totalValue;
	}

	
	
	
	

}
