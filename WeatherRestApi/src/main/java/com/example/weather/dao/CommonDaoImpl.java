package com.fiserv.merchantmaintenance.dao;

import static com.fiserv.merchantmaintenance.common.Constants.ACCOUNT_STATUS_PARAM;
import static com.fiserv.merchantmaintenance.common.Constants.CLIENT_NUMBER_PARAM;
import static com.fiserv.merchantmaintenance.common.Constants.DUAL_COLUMN_ENABLED;
import static com.fiserv.merchantmaintenance.common.Constants.INSTITUTION_NUMBER_PARAM;
import static com.fiserv.merchantmaintenance.common.Constants.INTERNAL_ACCOUNT_NUMBER_PARAM;
import static com.fiserv.merchantmaintenance.common.Constants.SECURE_DATA_ENABLED;
import static com.fiserv.merchantmaintenance.common.Constants.STATEMENT_GEN_PARAM;
import static com.fiserv.merchantmaintenance.common.Constants.STATEMENT_TYPE_PARAM;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CommonDaoImpl implements CommonDao {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public String getPostingDate(UUID correlationId, String institutionNumber) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue(INSTITUTION_NUMBER_PARAM, institutionNumber);
		return namedParameterJdbcTemplate.queryForObject(SqlQuery.QUERY_VALIDATE_POSTING_DATE, parameters, String.class);
	}
	
	@Override
	public List<String> getIntitutionAccountCurrency(UUID correlationId, String institutionNumber) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue(INSTITUTION_NUMBER_PARAM, institutionNumber);
		return namedParameterJdbcTemplate.queryForList(SqlQuery.QUERY_INSTITUTION_ACCOUNT_CURRENCY, parameters, String.class);
	}

	@Override
	public List<String> getIntitutionAccountType(UUID correlationId, String institutionNumber) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue(INSTITUTION_NUMBER_PARAM, institutionNumber);
		return namedParameterJdbcTemplate.queryForList(SqlQuery.QUERY_INSTITUTION_ACCOUNT_TYPE, parameters, String.class);
	}

	@Override
	public List<String> getClientContractStatus(UUID correlationId, String institutionNumber, String clientNumber) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue(INSTITUTION_NUMBER_PARAM, institutionNumber);
		parameters.addValue(CLIENT_NUMBER_PARAM, clientNumber);
		return namedParameterJdbcTemplate.queryForList(SqlQuery.QUERY_GET_MERCHANT_CONTRACT_STATUS, parameters, String.class);
	}

	@Override
	public int getStatementGenerationCountByInstAndIndex(String institutionNumber, String statementGeneration,UUID correlationId) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue(INSTITUTION_NUMBER_PARAM, institutionNumber);
		parameters.addValue(STATEMENT_GEN_PARAM, statementGeneration);
		return namedParameterJdbcTemplate.queryForObject(SqlQuery.QUERY_STATEMENT_GENERATION_COUNT, parameters, Integer.class);
	}

	@Override
	public int getStatementTypeCountByInstAndIndex(String institutionNumber, String statementType, UUID correlationId) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue(INSTITUTION_NUMBER_PARAM, institutionNumber);
		parameters.addValue(STATEMENT_TYPE_PARAM, statementType);
		return namedParameterJdbcTemplate.queryForObject(SqlQuery.QUERY_STATEMENT_TYPE_COUNT, parameters, Integer.class);
	}

	@Override
	public int getAccountStatusCountByInstAndIndex(String institutionNumber, String accountStatus, UUID correlationId) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue(INSTITUTION_NUMBER_PARAM, institutionNumber);
		parameters.addValue(ACCOUNT_STATUS_PARAM, accountStatus);
		return namedParameterJdbcTemplate.queryForObject(SqlQuery.QUERY_ACCOUNT_STATUS_COUNT, parameters, Integer.class);
	}

	@Override
	public String checkVoltageEnabled(String institutionNumber, UUID correlationId) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue(INSTITUTION_NUMBER_PARAM, institutionNumber);		
		return namedParameterJdbcTemplate.queryForObject(SqlQuery.QUERY_CHECK_VOLTAGE_STATUS, parameters, String.class);
	}

	@Override
	public Map<String,String> checkVoltageExclusive(String institutionNumber, UUID correlationId) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue(INSTITUTION_NUMBER_PARAM, institutionNumber);
		return namedParameterJdbcTemplate.queryForObject(SqlQuery.QUERY_CHECK_VOLTAGE_EXCLUSIVE,parameters, (rs, rowNum) ->{
			Map<String,String> map = new HashMap<>();
			map.put(SECURE_DATA_ENABLED,rs.getString(SECURE_DATA_ENABLED));
			map.put(DUAL_COLUMN_ENABLED,rs.getString(DUAL_COLUMN_ENABLED));
			return map;
		});
	}

	@Override
	public int getSepaMandateInfoCountByInstAndClientNumber(String institutionNumber, String clientNumber,
			String internalAccountNumber, UUID correlationId) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue(INSTITUTION_NUMBER_PARAM, institutionNumber);
		parameters.addValue(CLIENT_NUMBER_PARAM, clientNumber);
		parameters.addValue(INTERNAL_ACCOUNT_NUMBER_PARAM, internalAccountNumber);
		return namedParameterJdbcTemplate.queryForObject(SqlQuery.GET_SEPA_MANDATE_POPULATION_COUNT,parameters,Integer.class);
	}

	@Override
	public String getNextApplicationNumber(String institutionNumber, UUID correlationId) {		
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue(INSTITUTION_NUMBER_PARAM, institutionNumber);
		namedParameterJdbcTemplate.update(SqlQuery.QUERY_UPDATE_NEXT_APPLICATION,parameters);
		return namedParameterJdbcTemplate.queryForObject(SqlQuery.QUERY_SELECT_NEXT_APPLICATION_NUMBER,parameters,String.class);
	}
	
	@Override
	public String getLocalCurrencyByInstitution(String institutionNumber, UUID correlationId) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue(INSTITUTION_NUMBER_PARAM, institutionNumber);
		return namedParameterJdbcTemplate.queryForObject(SqlQuery.QUERY_GET_INST_LOCAL_CURRENCY,parameters,String.class);
	}

	@Override
	public List<Map<String, Object>> getParentAccount(String institutionNumber, String parentInternalMerchantId, UUID correlationId) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue(INSTITUTION_NUMBER_PARAM, institutionNumber);
		parameters.addValue("parentInternalMerchantId", parentInternalMerchantId);
		return namedParameterJdbcTemplate.queryForList(SqlQuery.QUERY_GET_PARENT_ACCOUNT, parameters);		
	}
	
}

