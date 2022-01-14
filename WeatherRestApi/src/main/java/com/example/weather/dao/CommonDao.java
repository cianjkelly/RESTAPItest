package com.fiserv.merchantmaintenance.dao;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface CommonDao {
	public String getPostingDate(UUID correlationId, String instNumber);
	public List<String> getIntitutionAccountCurrency(UUID correlationId, String institutionNumber);
	public List<String> getIntitutionAccountType(UUID correlationId, String institutionNumber);
	public List<String> getClientContractStatus(UUID correlationId, String institutionNumber, String clientNumber);
	public int getStatementGenerationCountByInstAndIndex(String institutionNumber, String statementGeneration, UUID correlationId);
	public int getStatementTypeCountByInstAndIndex(String institutionNumber, String statementType, UUID correlationId);
	public int getAccountStatusCountByInstAndIndex(String institutionNumber, String accountStatus, UUID correlationId);
	public int getSepaMandateInfoCountByInstAndClientNumber(String institutionNumber, String clientNumber, String internalAccountNumber, UUID correlationId);
	public String checkVoltageEnabled(String institutionNumber, UUID correlationId);
	public Map<String, String> checkVoltageExclusive(String institutionNumber, UUID correlationId);
	public String getNextApplicationNumber(String institutionNumber, UUID correlationId);
	public String getLocalCurrencyByInstitution(String institutionNumber, UUID correlationId);
	public List<Map<String, Object>> getParentAccount(String institutionNumber, String parentInternalMerchantId, UUID correlationId);
}
