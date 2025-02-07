package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/11/16 15:20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CallbackResponse {
    @JsonProperty("ActionStatus")
    protected String actionStatus;

    @JsonProperty("ErrorCode")
    protected Integer errorCode;

    @JsonProperty("ErrorInfo")
    protected String errorInfo;

    public CallbackResponse() {
    }

    public CallbackResponse(String actionStatus, Integer errorCode, String errorInfo) {
        this.actionStatus = actionStatus;
        this.errorCode = errorCode;
        this.errorInfo = errorInfo;
    }

    private CallbackResponse(Builder builder) {
        this.actionStatus = builder.actionStatus;
        this.errorCode = builder.errorCode;
        this.errorInfo = builder.errorInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }


    public static final class Builder {
        private String actionStatus;
        private Integer errorCode;
        private String errorInfo;

        private Builder() {
        }

        public CallbackResponse build() {
            return new CallbackResponse(this);
        }

        public Builder actionStatus(String actionStatus) {
            this.actionStatus = actionStatus;
            return this;
        }

        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public Builder errorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
    }
}
