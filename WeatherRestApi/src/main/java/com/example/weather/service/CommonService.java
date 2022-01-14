package com.fiserv.merchantmaintenance.service;
 
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.UUID;
 
import com.fiserv.merchantmaintenance.exception.GenericException;
 
public interface CommonService {
 
    String getPostingDate(String environment, UUID correlationId, String instNumber)
            throws SQLException, GenericException;
    List<String> getIntitutionAccountCurrency(String environment, UUID correlationId, String institutionNumber);
    
    List<String> getIntitutionAccountType(String environment, UUID correlationId, String institutionNumber);
    
    String getClientContractStatus(String environment, String institutionNumber, String clientNumber, UUID correlationId);
    
    public boolean validationStatementGeneration(String environment, String institutionNumber, String statementGeneration, UUID correlationId);
    public boolean validationStatementType(String environment, String institutionNumber, String statementType, UUID correlationId);
    public boolean validationAccountStatus(String environment, String institutionNumber, String accountStatus, UUID correlationId);
    public boolean checkVoltageEnabled(String environment, String institutionNumber, UUID correlationId);
    public boolean checkVoltageExclusive(String environment, String institutionNumber, UUID correlationId);
    public boolean getSepaMandatePopulation(String environment, String institutionNumber, String clientNumber, String internalMerchantAccount, UUID correlationId);
    public String getNextApplicationNumber(String environment,String institutionNumber, UUID correlationId);
    public String getLocalCurrencyByInstitution(String environment, String institutionNumber, UUID correlationId);
    public List<Map<String, Object>> getParentAccount(String environment, String institutionNumber, String parentInternalMerchantId, UUID correlationId);
}