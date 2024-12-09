package org.openapitools.model;

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
 * プロジェクト情報
 */
@JsonTypeName("ProjectResponse")
@jakarta.annotation.Generated(value = "nablarch.tool.openapi.codegen.JavaNablarchJaxrsServerCodegen", date = "2024-12-09T21:46:04.981051647+09:00[Asia/Tokyo]", comments = "Generator version: 7.10.0")
public class ProjectResponse   {
  private String id;
  private String name;
  private String sales;
  private String profit;
  private String startDate;
  private String endDate;
  private String registeredDateTime;
  private List<String> tags = new ArrayList<>();
  private Client client;

    /**
     * プロジェクトID
     */
    public ProjectResponse id(String id) {
        this.id = id;
        return this;
    }

    
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * プロジェクト名
     */
    public ProjectResponse name(String name) {
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
     */
    public ProjectResponse sales(String sales) {
        this.sales = sales;
        return this;
    }

    
    @JsonProperty("sales")
    public String getSales() {
        return sales;
    }

    @JsonProperty("sales")
    public void setSales(String sales) {
        this.sales = sales;
    }

    /**
     * 利益
     */
    public ProjectResponse profit(String profit) {
        this.profit = profit;
        return this;
    }

    
    @JsonProperty("profit")
    public String getProfit() {
        return profit;
    }

    @JsonProperty("profit")
    public void setProfit(String profit) {
        this.profit = profit;
    }

    /**
     * 開始日
     */
    public ProjectResponse startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    
    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 終了日
     */
    public ProjectResponse endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    
    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * 登録日時
     */
    public ProjectResponse registeredDateTime(String registeredDateTime) {
        this.registeredDateTime = registeredDateTime;
        return this;
    }

    
    @JsonProperty("registeredDateTime")
    public String getRegisteredDateTime() {
        return registeredDateTime;
    }

    @JsonProperty("registeredDateTime")
    public void setRegisteredDateTime(String registeredDateTime) {
        this.registeredDateTime = registeredDateTime;
    }

    /**
     * タグ
     */
    public ProjectResponse tags(List<String> tags) {
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

    public ProjectResponse addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }

        this.tags.add(tagsItem);
        return this;
    }

    public ProjectResponse removeTagsItem(String tagsItem) {
        if (tagsItem != null && this.tags != null) {
            this.tags.remove(tagsItem);
        }

        return this;
    }
    /**
     * クライアント情報
     */
    public ProjectResponse client(Client client) {
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
        ProjectResponse projectResponse = (ProjectResponse) o;
        return Objects.equals(this.id, projectResponse.id) &&
            Objects.equals(this.name, projectResponse.name) &&
            Objects.equals(this.sales, projectResponse.sales) &&
            Objects.equals(this.profit, projectResponse.profit) &&
            Objects.equals(this.startDate, projectResponse.startDate) &&
            Objects.equals(this.endDate, projectResponse.endDate) &&
            Objects.equals(this.registeredDateTime, projectResponse.registeredDateTime) &&
            Objects.equals(this.tags, projectResponse.tags) &&
            Objects.equals(this.client, projectResponse.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sales, profit, startDate, endDate, registeredDateTime, tags, client);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectResponse {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

