package com.websystique.springbatch;

import com.websystique.springbatch.model.Prelevement;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExamResultItemPreparedStatementSetter implements ItemPreparedStatementSetter<Prelevement> {

	public void setValues(Prelevement result, PreparedStatement ps) throws SQLException {
		ps.setString(1, result.getMode_Prlv());
		ps.setDate(2, new java.sql.Date(result.getDate_Echeance().toDate().getTime()));
		ps.setString(3, result.getCode_produit());
	}


}