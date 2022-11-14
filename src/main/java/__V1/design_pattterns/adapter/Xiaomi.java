package __V1.design_pattterns.adapter;

import lombok.Builder;

@Builder
public class Xiaomi implements AndroidPhone {
    private String platform;
    private String version;

    @Override
    public String getPlatform() {
        return platform;
    }

    @Override
    public String getVersion() {
        return version;
    }
}
