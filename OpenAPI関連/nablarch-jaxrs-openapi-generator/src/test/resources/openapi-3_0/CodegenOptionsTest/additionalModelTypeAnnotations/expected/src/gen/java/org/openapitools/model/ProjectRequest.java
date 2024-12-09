package org.openapitools.model;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Client;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * プロジェクト作成・更新情報
 */
@JsonTypeName("ProjectRequest")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:46:04.420411643+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
@jakarta.enterprise.context.SessionScoped
@jakarta.enterprise.context.RequestScoped
public class ProjectRequest   {
  private String name;
  private Long sales;
  private Integer profit;
  private LocalDate startDate;
  private LocalDate endDate;
  private OffsetDateTime registeredDateTime;
  private List<String> tags = new ArrayList<>();
  private Client client;

    /**
     * プロジェクト名
     */
    public ProjectRequest name(String name) {
        this.name = name;
        return this;
    }

    
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 売上
     * minimum: 1
     */
    public ProjectRequest sales(Long sales) {
        this.sales = sales;
        return this;
    }

    
    @JsonProperty("sales")
    public Long getSales() {
        return sales;
    }

    @JsonProperty("sales")
    public void setSales(Long sales) {
        this.sales = sales;
    }

    /**
     * 利益
     * minimum: 1
     */
    public ProjectRequest profit(Integer profit) {
        this.profit = profit;
        return this;
    }

    
    @JsonProperty("profit")
    public Integer getProfit() {
        return profit;
    }

    @JsonProperty("profit")
    public void setProfit(Integer profit) {
        this.profit = profit;
    }

    /**
     * 開始日
     */
    public ProjectRequest startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    
    @JsonProperty("startDate")
    public LocalDate getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * 終了日
     */
    public ProjectRequest endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    
    @JsonProperty("endDate")
    public LocalDate getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * 登録日時
     */
    public ProjectRequest registeredDateTime(OffsetDateTime registeredDateTime) {
        this.registeredDateTime = registeredDateTime;
        return this;
    }

    
    @JsonProperty("registeredDateTime")
    public OffsetDateTime getRegisteredDateTime() {
        return registeredDateTime;
    }

    @JsonProperty("registeredDateTime")
    public void setRegisteredDateTime(OffsetDateTime registeredDateTime) {
        this.registeredDateTime = registeredDateTime;
    }

    /**
     * タグ
     */
    public ProjectRequest tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ProjectRequest addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }

        this.tags.add(tagsItem);
        return this;
    }

    public ProjectRequest removeTagsItem(String tagsItem) {
        if (tagsItem != null && this.tags != null) {
            this.tags.remove(tagsItem);
        }

        return this;
    }
    /**
     * クライアント情報
     */
    public ProjectRequest client(Client client) {
        this.client = client;
        return this;
    }

    
    @JsonProperty("client")
    public Client getClient() {
        return client;
    }

    @JsonProperty("client")
    public void setClient(Client client) {
        this.client = client;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectRequest projectRequest = (ProjectRequest) o;
        return Objects.equals(this.name, projectRequest.name) &&
            Objects.equals(this.sales, projectRequest.sales) &&
            Objects.equals(this.profit, projectRequest.profit) &&
            Objects.equals(this.startDate, projectRequest.startDate) &&
            Objects.equals(this.endDate, projectRequest.endDate) &&
            Objects.equals(this.registeredDateTime, projectRequest.registeredDateTime) &&
            Objects.equals(this.tags, projectRequest.tags) &&
            Objects.equals(this.client, projectRequest.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sales, profit, startDate, endDate, registeredDateTime, tags, client);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectRequest {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
        sb.append("    profit: ").append(toIndentedString(profit)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    registeredDateTime: ").append(toIndentedString(registeredDateTime)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }


}

