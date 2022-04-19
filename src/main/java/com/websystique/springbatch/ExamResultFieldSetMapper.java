package com.websystique.springbatch;

import com.websystique.springbatch.model.Prelevement;
import org.joda.time.LocalDate;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class ExamResultFieldSetMapper implements FieldSetMapper<Prelevement>{

	@Override
	public Prelevement mapFieldSet(FieldSet fieldSet) throws BindException {
		Prelevement result = new Prelevement();
		result.setMode_Prlv(fieldSet.readString("mode_Prlv"));
		result.setDate_Echeance(new LocalDate(fieldSet.readDate("date_Echeance","ddMMyyyy")));
		result.setCode_produit(fieldSet.readString("code_produit"));
		return result;
	}

}
