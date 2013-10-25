package com.ripple.client.enums;

/**
 * Created with IntelliJ IDEA.
 * User: nick
 * Date: 10/22/13
 * Time: 5:40 PM
 */
public enum RPCErr {
    actBitcoin("Account is bitcoin address."),
    actExists("Account already exists."),
    actMalformed("Account malformed."),
    actNotFound("Account not found."),
    badBlob("Blob must be a non-empty hex string."),
    badFeature("Feature unknown or invalid."),
    badIssuer("Issuer account malformed."),
    badMarket("No such market."),
    badSecret("Secret does not match account."),
    badSeed("Disallowed seed."),
    badSyntax("Syntax error."),
    commandMissing("Missing command entry."),
    dstActMalformed("Destination account is malformed."),
    dstActMissing("Destination account does not exist."),
    dstAmtMalformed("Destination amount/currency/issuer is malformed."),
    dstIsrMalformed("Destination issuer is malformed."),
    forbidden("Bad credentials."),
    failGenDecrypt("Failed to decrypt generator."),
    getsActMalformed("Gets account malformed."),
    getsAmtMalformed("Gets amount malformed."),
    hostIpMalformed("Host IP is malformed."),
    insufFunds("Insufficient funds."),
    internal("Internal error."),
    invalidParams("Invalid parameters."),
    json_rpc("JSON-RPC transport error."),
    lgrIdxsInvalid("Ledger indexes invalid."),
    lgrIdxMalformed("Ledger index malformed."),
    lgrNotFound("Ledger not found."),
    nicknameMalformed("Nickname is malformed."),
    nicknameMissing("Nickname does not exist."),
    nicknamePerm("Account does not control nickname."),
    notImpl("Not implemented."),
    noAccount("No such account."),
    noClosed("Closed ledger is unavailable."),
    noCurrent("Current ledger is unavailable."),
    noEvents("Current transport does not support events."),
    noGenDectypt("Password failed to decrypt master public generator."),
    noNetwork("Network not available."),
    noPath("Unable to find a ripple path."),
    noPermission("You don't have permission for this command."),
    noPathRequest("No pathfinding request in progress."),
    notStandAlone("Operation valid in debug mode only."),
    notSupported("Operation not supported."),
    passwdChanged("Wrong key, password changed."),
    paysActMalformed("Pays account malformed."),
    paysAmtMalformed("Pays amount malformed."),
    portMalformed("Port is malformed."),
    publicMalformed("Public key is malformed."),
    qualityMalformed("Quality malformed."),
    srcActMalformed("Source account is malformed."),
    srcActMissing("Source account not provided."),
    srcActNotFound("Source account not found."),
    srcAmtMalformed("Source amount/currency/issuer is malformed."),
    srcCurMalformed("Source currency is malformed."),
    srcIsrMalformed("Source issuer is malformed."),
    srcUnclaimed("Source account is not claimed."),
    txnNotFound("Transaction not found."),
    unknownCmd("Unknown method."),
    wrongSeed("The regular key does not point as the master key."),
    tooBusy("The server is too busy to help you now."),
    slowDown("You are placing too much load on the server.");

    String message;
    RPCErr(String s) {
        message = s;
    }
}
