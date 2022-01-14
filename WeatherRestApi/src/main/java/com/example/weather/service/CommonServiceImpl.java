package com.fiserv.merchantmaintenance.service;
 
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.UUID;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.fiserv.merchantmaintenance.dao.CommonDao;
import com.fiserv.merchantmaintenance.exception.GenericException;
import com.fiserv.merchantmaintenance.utilities.LoggingUtil;
 
import lombok.extern.slf4j.Slf4j;
 
@Service
@Slf4j
public class CommonServiceImpl implements CommonService {
 
    @Autowired
    LoggingUtil loggingUtil;
    
    @Autowired
    private CommonDao commonDao;
    
    @Override
    public String getPostingDate(String environment, UUID correlationId, String instNumber)throws SQLException, GenericException {
 
        log.info(loggingUtil.formatLog( LoggingUtil.RequestDirection.IN,Thread.currentThread().getStackTrace()[1].getMethodName(),"Getting posting date...",""));
 
        String postingDate = commonDao.getPostingDate(correlationId, instNumber);
 
        log.info(loggingUtil.formatLog( LoggingUtil.RequestDirection.OUT,Thread.currentThread().getStackTrace()[1].getMethodName(),"Posting date retrieved...",""));
 
        return postingDate;
    }
    
    @Override
    public List<String> getIntitutionAccountCurrency(String environment, UUID correlationId, String institutionNumber) {        
        return commonDao.getIntitutionAccountCurrency(correlationId, institutionNumber);
    }
 
    @Override
    public List<String> getIntitutionAccountType(String environment, UUID correlationId, String institutionNumber) {
        return commonDao.getIntitutionAccountType(correlationId, institutionNumber);
    }
 
    @Override
    public String getClientContractStatus(String environment, String institutionNumber, String clientNumber, UUID correlationId) {
        String contractStatus = "";
        List<String> contractStatusList = commonDao.getClientContractStatus(correlationId, institutionNumber, clientNumber);
        if(contractStatusList!=null && !contractStatusList.isEmpty()) {
            contractStatus = contractStatusList.get(0);
        }
        return contractStatus;
    }
 
    @Override
    public boolean validationStatementGeneration(String environment, String institutionNumber,
            String statementGeneration, UUID correlationId) {
        int count = commonDao.getStatementGenerationCountByInstAndIndex(institutionNumber, statementGeneration, correlationId);
        return count != 0;
    }
 
    @Override
    public boolean validationStatementType(String environment, String institutionNumber, String statementType,
            UUID correlationId) {
        int count = commonDao.getStatementTypeCountByInstAndIndex(institutionNumber, statementType, correlationId);
        return count != 0;
    }
 
    @Override
    public boolean validationAccountStatus(String environment, String institutionNumber, String accountStatus,UUID correlationId) {
        int count = commonDao.getAccountStatusCountByInstAndIndex(institutionNumber,accountStatus,correlationId);
        return count != 0;
    }
 
    @Override
    public boolean checkVoltageEnabled(String environment, String institutionNumber, UUID correlationId) {
        String isVoltageEnabled = commonDao.checkVoltageEnabled(institutionNumber, correlationId);
        return "Y".equalsIgnoreCase(isVoltageEnabled);
    }
 
    @Override
    public boolean checkVoltageExclusive(String environment, String institutionNumber, UUID correlationId) {
        Map<String,String> result = commonDao.checkVoltageExclusive(institutionNumber, correlationId);
        return "-1".equals(result.get("SECURE_DATA_ENABLED")) && "0".equals(result.get("DUAL_COLUMN_ENABLED"));
    }
 
    @Override
    public boolean getSepaMandatePopulation(String environment, String institutionNumber, String clientNumber,
            String internalMerchantAccount, UUID correlationId) {
        return this.commonDao.getStatementGenerationCountByInstAndIndex(institutionNumber, internalMerchantAccount, correlationId) > 0;
    }
 
    @Override
    public String getNextApplicationNumber(String environment, String institutionNumber, UUID correlationId) {
        return commonDao.getNextApplicationNumber(institutionNumber,correlationId);
    }
    @Override
    public String getLocalCurrencyByInstitution(String environment, String institutionNumber, UUID correlationId) {
        return commonDao.getLocalCurrencyByInstitution(institutionNumber, correlationId);
    }
 
    @Override
    public List<Map<String, Object>> getParentAccount(String environment, String institutionNumber, String parentInternalMerchantId, UUID correlationId) {        
        return commonDao.getParentAccount(institutionNumber, parentInternalMerchantId, correlationId);
    }
    
    
    
    
    
}