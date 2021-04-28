package edu.ada.micronaut.service;

import yahoofinance.Stock;

import java.util.Map;

public interface FinancialService {

    Object getFinancialData(String stock_index);
    String getListFinancialData(String [] indices);

}
