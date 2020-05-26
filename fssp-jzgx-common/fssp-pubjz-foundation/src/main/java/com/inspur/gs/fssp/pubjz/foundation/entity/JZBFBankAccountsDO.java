package com.inspur.gs.fssp.pubjz.foundation.entity;

import java.util.Date;

/**
 * @author zhangpeng
 * @since 2019-08-09
 * <p>银行账户表
 */
public class JZBFBankAccountsDO {
    /**
     * 内码
     */
    private String id;
    /**
     * 账户姓名
     */
    private String accountname;
    /**
     * 账户编号
     */
    private String accountno;
    /**
     *
     */
    private String accountproperty;
    /**
     *账户状态
     */
    private String accountstatus;
    /**
     *
     */
    private String accountunit;
    /**
     *
     */
    private String accountingdepartment;
    /**
     *申请人id
     */
    private String applicantid;
    /**
     *申请人姓名
     */
    private String applicantname;
    /**
     * 申请日期
     */
    private Date applicationdate;
    /**
     *
     */
    private String balanceddirection;
    /**
     *
     */
    private String bank;
    /**
     *注销日期
     */
    private Date bankcancellationdate;
    /**
     *注销人
     */
    private String bankcanceller;
    /**
     *
     */
    private String bankcontact;
    /**
     *
     */
    private String bankcontactphonenumber;
    /**
     *
     */
    private String bankincash;
    /**
     *
     */
    private String banknameofchina;
    /**
     *
     */
    private String banknoofchina;
    /**
     *城市
     */
    private String city;
    /**
     *
     */
    private Date closeddate;
    /**
     *
     */
    private String closeduserid;
    /**
     *
     */
    private String closedusername;
    /**
     *
     */
    private String corporationunit;
    /**
     *
     */
    private String correspondingaccounttitle;
    /**
     *
     */
    private String country;
    /**
     *
     */
    private String createunit;
    /**
     *
     */
    private String deadlinebymonth;
    /**
     *
     */
    private String dealingcenter;
    /**
     *
     */
    private String dealingnature;
    /**
     *
     */
    private String defaultcurrency;
    /**
     * 部门
     */
    private String department;
    /**
     *
     */
    private Date disabledate;
    /**
     *
     */
    private String disableuserid;
    /**
     *
     */
    private String disableusername;
    /**
     *
     */
    private String draftinterest;
    /**
     *
     */
    private String draftlimitedamount;
    /**
     *
     */
    private Date duedate;
    /**
     *
     */
    private String expendituredirection;
    /**
     *
     */
    private String freezestatus;
    /**
     *
     */
    private String higheraccount;
    /**
     *
     */
    private Character ifcopybusinesslicense;
    /**
     *
     */
    private Character ifdefaultsettlement;
    /**
     *
     */
    private Character ifdraft;
    /**
     *
     */
    private Character ifincashaccount;
    /**
     *
     */
    private Character ifinterest;
    /**
     *
     */
    private Character iforganizationcode;
    /**
     *
     */
    private Character iforiginalbusinesslicense;
    /**
     *
     */
    private Character ifzerobalance;
    /**
     *
     */
    private String incomeorexpense;
    /**
     *
     */
    private String innerorouter;
    /**
     *
     */
    private String interestrate;
    /**
     *
     */
    private String note;
    /**
     *网上银行入口
     */
    private String onlinbankinterface;
    /**
     *
     */
    private String onlinebankopenstatus;
    /**
     *
     */
    private Date opendate;
    /**
     *
     */
    private String openingexplain;
    /**
     *
     */
    private String openingreason;
    /**
     *
     */
    private String operator;
    /**
     *
     */
    private String operatorphonenumber;
    /**
     *
     */
    private Date otherdate;
    /**
     *省份
     */
    private String province;
    /**
     *
     */
    private String relatedid;
    /**
     *
     */
    private String shortname;
    /**
     *
     */
    private Date startdate;
    /**
     *
     */
    private String startuserid;
    /**
     *
     */
    private String startusername;
    /**
     *修改人
     */
    private String timestamp_createdby;
    /**
     *修改日期
     */
    private Date timestamp_createdon;
    /**
     *最后修改人
     */
    private String timestamp_lastchangedby;
    /**
     *最后修改时间
     */
    private String timestamp_lastchangedon;
    /**
     *
     */
    private String totaldividetype;
    /**
     *
     */
    private String unitaddress;
    /**
     *
     */
    private String unitnature;


    /**
     * 获取 内码
     *
     * @return id 内码
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置 内码
     *
     * @param id 内码
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取 账户姓名
     *
     * @return accountname 账户姓名
     */
    public String getAccountname() {
        return this.accountname;
    }

    /**
     * 设置 账户姓名
     *
     * @param accountname 账户姓名
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    /**
     * 获取 账户编号
     *
     * @return accountno 账户编号
     */
    public String getAccountno() {
        return this.accountno;
    }

    /**
     * 设置 账户编号
     *
     * @param accountno 账户编号
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
     * 获取
     *
     * @return accountproperty
     */
    public String getAccountproperty() {
        return this.accountproperty;
    }

    /**
     * 设置
     *
     * @param accountproperty
     */
    public void setAccountproperty(String accountproperty) {
        this.accountproperty = accountproperty;
    }

    /**
     * 获取 账户状态
     *
     * @return accountstatus 账户状态
     */
    public String getAccountstatus() {
        return this.accountstatus;
    }

    /**
     * 设置 账户状态
     *
     * @param accountstatus 账户状态
     */
    public void setAccountstatus(String accountstatus) {
        this.accountstatus = accountstatus;
    }

    /**
     * 获取
     *
     * @return accountunit
     */
    public String getAccountunit() {
        return this.accountunit;
    }

    /**
     * 设置
     *
     * @param accountunit
     */
    public void setAccountunit(String accountunit) {
        this.accountunit = accountunit;
    }

    /**
     * 获取
     *
     * @return accountingdepartment
     */
    public String getAccountingdepartment() {
        return this.accountingdepartment;
    }

    /**
     * 设置
     *
     * @param accountingdepartment
     */
    public void setAccountingdepartment(String accountingdepartment) {
        this.accountingdepartment = accountingdepartment;
    }

    /**
     * 获取 申请人id
     *
     * @return applicantid 申请人id
     */
    public String getApplicantid() {
        return this.applicantid;
    }

    /**
     * 设置 申请人id
     *
     * @param applicantid 申请人id
     */
    public void setApplicantid(String applicantid) {
        this.applicantid = applicantid;
    }

    /**
     * 获取 申请人姓名
     *
     * @return applicantname 申请人姓名
     */
    public String getApplicantname() {
        return this.applicantname;
    }

    /**
     * 设置 申请人姓名
     *
     * @param applicantname 申请人姓名
     */
    public void setApplicantname(String applicantname) {
        this.applicantname = applicantname;
    }

    /**
     * 获取 申请日期
     *
     * @return applicationdate 申请日期
     */
    public Date getApplicationdate() {
        return this.applicationdate;
    }

    /**
     * 设置 申请日期
     *
     * @param applicationdate 申请日期
     */
    public void setApplicationdate(Date applicationdate) {
        this.applicationdate = applicationdate;
    }

    /**
     * 获取
     *
     * @return balanceddirection
     */
    public String getBalanceddirection() {
        return this.balanceddirection;
    }

    /**
     * 设置
     *
     * @param balanceddirection
     */
    public void setBalanceddirection(String balanceddirection) {
        this.balanceddirection = balanceddirection;
    }

    /**
     * 获取
     *
     * @return bank
     */
    public String getBank() {
        return this.bank;
    }

    /**
     * 设置
     *
     * @param bank
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * 获取 注销日期
     *
     * @return bankcancellationdate 注销日期
     */
    public Date getBankcancellationdate() {
        return this.bankcancellationdate;
    }

    /**
     * 设置 注销日期
     *
     * @param bankcancellationdate 注销日期
     */
    public void setBankcancellationdate(Date bankcancellationdate) {
        this.bankcancellationdate = bankcancellationdate;
    }

    /**
     * 获取 注销人
     *
     * @return bankcanceller 注销人
     */
    public String getBankcanceller() {
        return this.bankcanceller;
    }

    /**
     * 设置 注销人
     *
     * @param bankcanceller 注销人
     */
    public void setBankcanceller(String bankcanceller) {
        this.bankcanceller = bankcanceller;
    }

    /**
     * 获取
     *
     * @return bankcontact
     */
    public String getBankcontact() {
        return this.bankcontact;
    }

    /**
     * 设置
     *
     * @param bankcontact
     */
    public void setBankcontact(String bankcontact) {
        this.bankcontact = bankcontact;
    }

    /**
     * 获取
     *
     * @return bankcontactphonenumber
     */
    public String getBankcontactphonenumber() {
        return this.bankcontactphonenumber;
    }

    /**
     * 设置
     *
     * @param bankcontactphonenumber
     */
    public void setBankcontactphonenumber(String bankcontactphonenumber) {
        this.bankcontactphonenumber = bankcontactphonenumber;
    }

    /**
     * 获取
     *
     * @return bankincash
     */
    public String getBankincash() {
        return this.bankincash;
    }

    /**
     * 设置
     *
     * @param bankincash
     */
    public void setBankincash(String bankincash) {
        this.bankincash = bankincash;
    }

    /**
     * 获取
     *
     * @return banknameofchina
     */
    public String getBanknameofchina() {
        return this.banknameofchina;
    }

    /**
     * 设置
     *
     * @param banknameofchina
     */
    public void setBanknameofchina(String banknameofchina) {
        this.banknameofchina = banknameofchina;
    }

    /**
     * 获取
     *
     * @return banknoofchina
     */
    public String getBanknoofchina() {
        return this.banknoofchina;
    }

    /**
     * 设置
     *
     * @param banknoofchina
     */
    public void setBanknoofchina(String banknoofchina) {
        this.banknoofchina = banknoofchina;
    }

    /**
     * 获取 城市
     *
     * @return city 城市
     */
    public String getCity() {
        return this.city;
    }

    /**
     * 设置 城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取
     *
     * @return closeddate
     */
    public Date getCloseddate() {
        return this.closeddate;
    }

    /**
     * 设置
     *
     * @param closeddate
     */
    public void setCloseddate(Date closeddate) {
        this.closeddate = closeddate;
    }

    /**
     * 获取
     *
     * @return closeduserid
     */
    public String getCloseduserid() {
        return this.closeduserid;
    }

    /**
     * 设置
     *
     * @param closeduserid
     */
    public void setCloseduserid(String closeduserid) {
        this.closeduserid = closeduserid;
    }

    /**
     * 获取
     *
     * @return closedusername
     */
    public String getClosedusername() {
        return this.closedusername;
    }

    /**
     * 设置
     *
     * @param closedusername
     */
    public void setClosedusername(String closedusername) {
        this.closedusername = closedusername;
    }

    /**
     * 获取
     *
     * @return corporationunit
     */
    public String getCorporationunit() {
        return this.corporationunit;
    }

    /**
     * 设置
     *
     * @param corporationunit
     */
    public void setCorporationunit(String corporationunit) {
        this.corporationunit = corporationunit;
    }

    /**
     * 获取
     *
     * @return correspondingaccounttitle
     */
    public String getCorrespondingaccounttitle() {
        return this.correspondingaccounttitle;
    }

    /**
     * 设置
     *
     * @param correspondingaccounttitle
     */
    public void setCorrespondingaccounttitle(String correspondingaccounttitle) {
        this.correspondingaccounttitle = correspondingaccounttitle;
    }

    /**
     * 获取
     *
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * 设置
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取
     *
     * @return createunit
     */
    public String getCreateunit() {
        return this.createunit;
    }

    /**
     * 设置
     *
     * @param createunit
     */
    public void setCreateunit(String createunit) {
        this.createunit = createunit;
    }

    /**
     * 获取
     *
     * @return deadlinebymonth
     */
    public String getDeadlinebymonth() {
        return this.deadlinebymonth;
    }

    /**
     * 设置
     *
     * @param deadlinebymonth
     */
    public void setDeadlinebymonth(String deadlinebymonth) {
        this.deadlinebymonth = deadlinebymonth;
    }

    /**
     * 获取
     *
     * @return dealingcenter
     */
    public String getDealingcenter() {
        return this.dealingcenter;
    }

    /**
     * 设置
     *
     * @param dealingcenter
     */
    public void setDealingcenter(String dealingcenter) {
        this.dealingcenter = dealingcenter;
    }

    /**
     * 获取
     *
     * @return dealingnature
     */
    public String getDealingnature() {
        return this.dealingnature;
    }

    /**
     * 设置
     *
     * @param dealingnature
     */
    public void setDealingnature(String dealingnature) {
        this.dealingnature = dealingnature;
    }

    /**
     * 获取
     *
     * @return defaultcurrency
     */
    public String getDefaultcurrency() {
        return this.defaultcurrency;
    }

    /**
     * 设置
     *
     * @param defaultcurrency
     */
    public void setDefaultcurrency(String defaultcurrency) {
        this.defaultcurrency = defaultcurrency;
    }

    /**
     * 获取 部门
     *
     * @return department 部门
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * 设置 部门
     *
     * @param department 部门
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取
     *
     * @return disabledate
     */
    public Date getDisabledate() {
        return this.disabledate;
    }

    /**
     * 设置
     *
     * @param disabledate
     */
    public void setDisabledate(Date disabledate) {
        this.disabledate = disabledate;
    }

    /**
     * 获取
     *
     * @return disableuserid
     */
    public String getDisableuserid() {
        return this.disableuserid;
    }

    /**
     * 设置
     *
     * @param disableuserid
     */
    public void setDisableuserid(String disableuserid) {
        this.disableuserid = disableuserid;
    }

    /**
     * 获取
     *
     * @return disableusername
     */
    public String getDisableusername() {
        return this.disableusername;
    }

    /**
     * 设置
     *
     * @param disableusername
     */
    public void setDisableusername(String disableusername) {
        this.disableusername = disableusername;
    }

    /**
     * 获取
     *
     * @return draftinterest
     */
    public String getDraftinterest() {
        return this.draftinterest;
    }

    /**
     * 设置
     *
     * @param draftinterest
     */
    public void setDraftinterest(String draftinterest) {
        this.draftinterest = draftinterest;
    }

    /**
     * 获取
     *
     * @return draftlimitedamount
     */
    public String getDraftlimitedamount() {
        return this.draftlimitedamount;
    }

    /**
     * 设置
     *
     * @param draftlimitedamount
     */
    public void setDraftlimitedamount(String draftlimitedamount) {
        this.draftlimitedamount = draftlimitedamount;
    }

    /**
     * 获取
     *
     * @return duedate
     */
    public Date getDuedate() {
        return this.duedate;
    }

    /**
     * 设置
     *
     * @param duedate
     */
    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    /**
     * 获取
     *
     * @return expendituredirection
     */
    public String getExpendituredirection() {
        return this.expendituredirection;
    }

    /**
     * 设置
     *
     * @param expendituredirection
     */
    public void setExpendituredirection(String expendituredirection) {
        this.expendituredirection = expendituredirection;
    }

    /**
     * 获取
     *
     * @return freezestatus
     */
    public String getFreezestatus() {
        return this.freezestatus;
    }

    /**
     * 设置
     *
     * @param freezestatus
     */
    public void setFreezestatus(String freezestatus) {
        this.freezestatus = freezestatus;
    }

    /**
     * 获取
     *
     * @return higheraccount
     */
    public String getHigheraccount() {
        return this.higheraccount;
    }

    /**
     * 设置
     *
     * @param higheraccount
     */
    public void setHigheraccount(String higheraccount) {
        this.higheraccount = higheraccount;
    }

    /**
     * 获取
     *
     * @return ifcopybusinesslicense
     */
    public Character getIfcopybusinesslicense() {
        return this.ifcopybusinesslicense;
    }

    /**
     * 设置
     *
     * @param ifcopybusinesslicense
     */
    public void setIfcopybusinesslicense(Character ifcopybusinesslicense) {
        this.ifcopybusinesslicense = ifcopybusinesslicense;
    }

    /**
     * 获取
     *
     * @return ifdefaultsettlement
     */
    public Character getIfdefaultsettlement() {
        return this.ifdefaultsettlement;
    }

    /**
     * 设置
     *
     * @param ifdefaultsettlement
     */
    public void setIfdefaultsettlement(Character ifdefaultsettlement) {
        this.ifdefaultsettlement = ifdefaultsettlement;
    }

    /**
     * 获取
     *
     * @return ifdraft
     */
    public Character getIfdraft() {
        return this.ifdraft;
    }

    /**
     * 设置
     *
     * @param ifdraft
     */
    public void setIfdraft(Character ifdraft) {
        this.ifdraft = ifdraft;
    }

    /**
     * 获取
     *
     * @return ifincashaccount
     */
    public Character getIfincashaccount() {
        return this.ifincashaccount;
    }

    /**
     * 设置
     *
     * @param ifincashaccount
     */
    public void setIfincashaccount(Character ifincashaccount) {
        this.ifincashaccount = ifincashaccount;
    }

    /**
     * 获取
     *
     * @return ifinterest
     */
    public Character getIfinterest() {
        return this.ifinterest;
    }

    /**
     * 设置
     *
     * @param ifinterest
     */
    public void setIfinterest(Character ifinterest) {
        this.ifinterest = ifinterest;
    }

    /**
     * 获取
     *
     * @return iforganizationcode
     */
    public Character getIforganizationcode() {
        return this.iforganizationcode;
    }

    /**
     * 设置
     *
     * @param iforganizationcode
     */
    public void setIforganizationcode(Character iforganizationcode) {
        this.iforganizationcode = iforganizationcode;
    }

    /**
     * 获取
     *
     * @return iforiginalbusinesslicense
     */
    public Character getIforiginalbusinesslicense() {
        return this.iforiginalbusinesslicense;
    }

    /**
     * 设置
     *
     * @param iforiginalbusinesslicense
     */
    public void setIforiginalbusinesslicense(Character iforiginalbusinesslicense) {
        this.iforiginalbusinesslicense = iforiginalbusinesslicense;
    }

    /**
     * 获取
     *
     * @return ifzerobalance
     */
    public Character getIfzerobalance() {
        return this.ifzerobalance;
    }

    /**
     * 设置
     *
     * @param ifzerobalance
     */
    public void setIfzerobalance(Character ifzerobalance) {
        this.ifzerobalance = ifzerobalance;
    }

    /**
     * 获取
     *
     * @return incomeorexpense
     */
    public String getIncomeorexpense() {
        return this.incomeorexpense;
    }

    /**
     * 设置
     *
     * @param incomeorexpense
     */
    public void setIncomeorexpense(String incomeorexpense) {
        this.incomeorexpense = incomeorexpense;
    }

    /**
     * 获取
     *
     * @return innerorouter
     */
    public String getInnerorouter() {
        return this.innerorouter;
    }

    /**
     * 设置
     *
     * @param innerorouter
     */
    public void setInnerorouter(String innerorouter) {
        this.innerorouter = innerorouter;
    }

    /**
     * 获取
     *
     * @return interestrate
     */
    public String getInterestrate() {
        return this.interestrate;
    }

    /**
     * 设置
     *
     * @param interestrate
     */
    public void setInterestrate(String interestrate) {
        this.interestrate = interestrate;
    }

    /**
     * 获取
     *
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * 设置
     *
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 获取 网上银行入口
     *
     * @return onlinbankinterface 网上银行入口
     */
    public String getOnlinbankinterface() {
        return this.onlinbankinterface;
    }

    /**
     * 设置 网上银行入口
     *
     * @param onlinbankinterface 网上银行入口
     */
    public void setOnlinbankinterface(String onlinbankinterface) {
        this.onlinbankinterface = onlinbankinterface;
    }

    /**
     * 获取
     *
     * @return onlinebankopenstatus
     */
    public String getOnlinebankopenstatus() {
        return this.onlinebankopenstatus;
    }

    /**
     * 设置
     *
     * @param onlinebankopenstatus
     */
    public void setOnlinebankopenstatus(String onlinebankopenstatus) {
        this.onlinebankopenstatus = onlinebankopenstatus;
    }

    /**
     * 获取
     *
     * @return opendate
     */
    public Date getOpendate() {
        return this.opendate;
    }

    /**
     * 设置
     *
     * @param opendate
     */
    public void setOpendate(Date opendate) {
        this.opendate = opendate;
    }

    /**
     * 获取
     *
     * @return openingexplain
     */
    public String getOpeningexplain() {
        return this.openingexplain;
    }

    /**
     * 设置
     *
     * @param openingexplain
     */
    public void setOpeningexplain(String openingexplain) {
        this.openingexplain = openingexplain;
    }

    /**
     * 获取
     *
     * @return openingreason
     */
    public String getOpeningreason() {
        return this.openingreason;
    }

    /**
     * 设置
     *
     * @param openingreason
     */
    public void setOpeningreason(String openingreason) {
        this.openingreason = openingreason;
    }

    /**
     * 获取
     *
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * 设置
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 获取
     *
     * @return operatorphonenumber
     */
    public String getOperatorphonenumber() {
        return this.operatorphonenumber;
    }

    /**
     * 设置
     *
     * @param operatorphonenumber
     */
    public void setOperatorphonenumber(String operatorphonenumber) {
        this.operatorphonenumber = operatorphonenumber;
    }

    /**
     * 获取
     *
     * @return otherdate
     */
    public Date getOtherdate() {
        return this.otherdate;
    }

    /**
     * 设置
     *
     * @param otherdate
     */
    public void setOtherdate(Date otherdate) {
        this.otherdate = otherdate;
    }

    /**
     * 获取 省份
     *
     * @return province 省份
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * 设置 省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取
     *
     * @return relatedid
     */
    public String getRelatedid() {
        return this.relatedid;
    }

    /**
     * 设置
     *
     * @param relatedid
     */
    public void setRelatedid(String relatedid) {
        this.relatedid = relatedid;
    }

    /**
     * 获取
     *
     * @return shortname
     */
    public String getShortname() {
        return this.shortname;
    }

    /**
     * 设置
     *
     * @param shortname
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    /**
     * 获取
     *
     * @return startdate
     */
    public Date getStartdate() {
        return this.startdate;
    }

    /**
     * 设置
     *
     * @param startdate
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     * 获取
     *
     * @return startuserid
     */
    public String getStartuserid() {
        return this.startuserid;
    }

    /**
     * 设置
     *
     * @param startuserid
     */
    public void setStartuserid(String startuserid) {
        this.startuserid = startuserid;
    }

    /**
     * 获取
     *
     * @return startusername
     */
    public String getStartusername() {
        return this.startusername;
    }

    /**
     * 设置
     *
     * @param startusername
     */
    public void setStartusername(String startusername) {
        this.startusername = startusername;
    }

    /**
     * 获取 修改人
     *
     * @return timestamp_createdby 修改人
     */
    public String getTimestamp_createdby() {
        return this.timestamp_createdby;
    }

    /**
     * 设置 修改人
     *
     * @param timestamp_createdby 修改人
     */
    public void setTimestamp_createdby(String timestamp_createdby) {
        this.timestamp_createdby = timestamp_createdby;
    }

    /**
     * 获取 修改日期
     *
     * @return timestamp_createdon 修改日期
     */
    public Date getTimestamp_createdon() {
        return this.timestamp_createdon;
    }

    /**
     * 设置 修改日期
     *
     * @param timestamp_createdon 修改日期
     */
    public void setTimestamp_createdon(Date timestamp_createdon) {
        this.timestamp_createdon = timestamp_createdon;
    }

    /**
     * 获取 最后修改人
     *
     * @return timestamp_lastchangedby 最后修改人
     */
    public String getTimestamp_lastchangedby() {
        return this.timestamp_lastchangedby;
    }

    /**
     * 设置 最后修改人
     *
     * @param timestamp_lastchangedby 最后修改人
     */
    public void setTimestamp_lastchangedby(String timestamp_lastchangedby) {
        this.timestamp_lastchangedby = timestamp_lastchangedby;
    }

    /**
     * 获取 最后修改时间
     *
     * @return timestamp_lastchangedon 最后修改时间
     */
    public String getTimestamp_lastchangedon() {
        return this.timestamp_lastchangedon;
    }

    /**
     * 设置 最后修改时间
     *
     * @param timestamp_lastchangedon 最后修改时间
     */
    public void setTimestamp_lastchangedon(String timestamp_lastchangedon) {
        this.timestamp_lastchangedon = timestamp_lastchangedon;
    }

    /**
     * 获取
     *
     * @return totaldividetype
     */
    public String getTotaldividetype() {
        return this.totaldividetype;
    }

    /**
     * 设置
     *
     * @param totaldividetype
     */
    public void setTotaldividetype(String totaldividetype) {
        this.totaldividetype = totaldividetype;
    }

    /**
     * 获取
     *
     * @return unitaddress
     */
    public String getUnitaddress() {
        return this.unitaddress;
    }

    /**
     * 设置
     *
     * @param unitaddress
     */
    public void setUnitaddress(String unitaddress) {
        this.unitaddress = unitaddress;
    }

    /**
     * 获取
     *
     * @return unitnature
     */
    public String getUnitnature() {
        return this.unitnature;
    }

    /**
     * 设置
     *
     * @param unitnature
     */
    public void setUnitnature(String unitnature) {
        this.unitnature = unitnature;
    }


    @Override
    public String toString() {
        return "BFBankAccountsDO{" +
                "id='" + id + '\'' +
                ", accountname='" + accountname + '\'' +
                ", accountno='" + accountno + '\'' +
                ", accountproperty='" + accountproperty + '\'' +
                ", accountstatus='" + accountstatus + '\'' +
                ", accountunit='" + accountunit + '\'' +
                ", accountingdepartment='" + accountingdepartment + '\'' +
                ", applicantid='" + applicantid + '\'' +
                ", applicantname='" + applicantname + '\'' +
                ", applicationdate=" + applicationdate +
                ", balanceddirection='" + balanceddirection + '\'' +
                ", bank='" + bank + '\'' +
                ", bankcancellationdate=" + bankcancellationdate +
                ", bankcanceller='" + bankcanceller + '\'' +
                ", bankcontact='" + bankcontact + '\'' +
                ", bankcontactphonenumber='" + bankcontactphonenumber + '\'' +
                ", bankincash='" + bankincash + '\'' +
                ", banknameofchina='" + banknameofchina + '\'' +
                ", banknoofchina='" + banknoofchina + '\'' +
                ", city='" + city + '\'' +
                ", closeddate=" + closeddate +
                ", closeduserid='" + closeduserid + '\'' +
                ", closedusername='" + closedusername + '\'' +
                ", corporationunit='" + corporationunit + '\'' +
                ", correspondingaccounttitle='" + correspondingaccounttitle + '\'' +
                ", country='" + country + '\'' +
                ", createunit='" + createunit + '\'' +
                ", deadlinebymonth='" + deadlinebymonth + '\'' +
                ", dealingcenter='" + dealingcenter + '\'' +
                ", dealingnature='" + dealingnature + '\'' +
                ", defaultcurrency='" + defaultcurrency + '\'' +
                ", department='" + department + '\'' +
                ", disabledate=" + disabledate +
                ", disableuserid='" + disableuserid + '\'' +
                ", disableusername='" + disableusername + '\'' +
                ", draftinterest='" + draftinterest + '\'' +
                ", draftlimitedamount='" + draftlimitedamount + '\'' +
                ", duedate=" + duedate +
                ", expendituredirection='" + expendituredirection + '\'' +
                ", freezestatus='" + freezestatus + '\'' +
                ", higheraccount='" + higheraccount + '\'' +
                ", ifcopybusinesslicense=" + ifcopybusinesslicense +
                ", ifdefaultsettlement=" + ifdefaultsettlement +
                ", ifdraft=" + ifdraft +
                ", ifincashaccount=" + ifincashaccount +
                ", ifinterest=" + ifinterest +
                ", iforganizationcode=" + iforganizationcode +
                ", iforiginalbusinesslicense=" + iforiginalbusinesslicense +
                ", ifzerobalance=" + ifzerobalance +
                ", incomeorexpense='" + incomeorexpense + '\'' +
                ", innerorouter='" + innerorouter + '\'' +
                ", interestrate='" + interestrate + '\'' +
                ", note='" + note + '\'' +
                ", onlinbankinterface='" + onlinbankinterface + '\'' +
                ", onlinebankopenstatus='" + onlinebankopenstatus + '\'' +
                ", opendate=" + opendate +
                ", openingexplain='" + openingexplain + '\'' +
                ", openingreason='" + openingreason + '\'' +
                ", operator='" + operator + '\'' +
                ", operatorphonenumber='" + operatorphonenumber + '\'' +
                ", otherdate=" + otherdate +
                ", province='" + province + '\'' +
                ", relatedid='" + relatedid + '\'' +
                ", shortname='" + shortname + '\'' +
                ", startdate=" + startdate +
                ", startuserid='" + startuserid + '\'' +
                ", startusername='" + startusername + '\'' +
                ", timestamp_createdby='" + timestamp_createdby + '\'' +
                ", timestamp_createdon=" + timestamp_createdon +
                ", timestamp_lastchangedby='" + timestamp_lastchangedby + '\'' +
                ", timestamp_lastchangedon='" + timestamp_lastchangedon + '\'' +
                ", totaldividetype='" + totaldividetype + '\'' +
                ", unitaddress='" + unitaddress + '\'' +
                ", unitnature='" + unitnature + '\'' +
                '}';
    }
}


