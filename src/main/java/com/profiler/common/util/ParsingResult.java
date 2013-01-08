package com.profiler.common.util;

/**
 *
 */
public class ParsingResult {
    private String sql;
    private StringBuilder output;

    public ParsingResult() {
    }

    public ParsingResult(String sql, StringBuilder output) {
        this.output = output;
        this.sql = sql;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getOutput() {
        if (output == null) {
            return "";
        }
        return output.toString();
    }

    /**
     * 최초 한번은 불려야 된다 안불리고 appendOutputParam을 호출하면 nullpointer exception
     *
     * @param separator
     */
    void appendOutputSeparator(char separator) {
        if (output == null) {
            this.output = new StringBuilder();
        } else {
            this.output.append(separator);
        }
    }

    void appendOutputParam(String str) {
        this.output.append(str);
    }

    void appendOutputParam(char ch) {
        this.output.append(ch);
    }

    @Override
    public String toString() {
        return "ParsingResult{" +
                "sql='" + sql + '\'' +
                ", output=" + output +
                '}';
    }
}
