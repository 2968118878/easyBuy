package cn.easybuy.entity.product;

public class Product {
    private int id;             //商品编号
    private String name;        //商品名字
    private String description; //商品描述
    private double price;       //商品价格
    private int stock;          //商品库存
    private int categoryLevel1; //所属分类ID
    private int categoryLevel2; //所属二级分类ID
    private int categoryLevel3; //所属三级分类ID
    private String fileName;       //上传的文件名
    private int isDelete;       //是否删除 1：删除，0：未删除

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCategoryLevel1() {
        return categoryLevel1;
    }

    public void setCategoryLevel1(int categoryLevel1) {
        this.categoryLevel1 = categoryLevel1;
    }

    public int getCategoryLevel2() {
        return categoryLevel2;
    }

    public void setCategoryLevel2(int categoryLevel2) {
        this.categoryLevel2 = categoryLevel2;
    }

    public int getCategoryLevel3() {
        return categoryLevel3;
    }

    public void setCategoryLevel3(int categoryLevel3) {
        this.categoryLevel3 = categoryLevel3;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
