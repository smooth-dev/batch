package com.websystique.springbatch;

import com.websystique.springbatch.model.Prelevement;
import org.springframework.batch.item.ItemProcessor;

public class ExamResultItemProcessor implements ItemProcessor<Prelevement, Prelevement>{

	
	@Override
	public Prelevement process(Prelevement result) throws Exception {
		System.out.println("Processing result :"+result);
		
		/*
		 * Only return results which are more than 75%
		 * 
		 */
		if(result.getCode_produit().contains("zz")){
			return null;
		}
		
		return result;
	}

}
