package com.joey.ssm.mybatisplus.model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author joey123
 * @since 2018-03-22
 */
public class User implements Serializable {

private static final long serialVersionUID = 1L;

                    @TableId(value = "id", type = IdType.AUTO)
                private Integer id;
        private String name;
        private Integer age;


    public Integer getId() {
            return id;
            }

        public void setId(Integer id) {
            this.id = id;
            }

    public String getName() {
            return name;
            }

        public void setName(String name) {
            this.name = name;
            }

    public Integer getAge() {
            return age;
            }

        public void setAge(Integer age) {
            this.age = age;
            }

@Override
public String toString() {
        return "User{" +
                ", id=" + id +
                ", name=" + name +
                ", age=" + age +
        "}";
        }
        }