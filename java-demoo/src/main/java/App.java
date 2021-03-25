import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.hutool.json.JSONUtil;
import lombok.Data;

@Data
public class App {
    public static void main(String[] args) {


        //        Student student = new Student();
        //
        //        Class<? extends Student> aClass = student.getClass();
        //
        //        Field[] declaredFields = aClass.getDeclaredFields();
        //        for (Field declaredField : declaredFields) {
        //            declaredField.setAccessible(true);
        //
        //
        //            try {
        //                System.out.println(declaredField.getName() + "----" + declaredField.get(student));
        //            } catch (Exception e) {
        //                e.printStackTrace();
        //            }
        //        }

        String str = "{\n"
                + "    \"childNodeList\": [\n"
                + "        {\n"
                + "            \"childNodeList\": [\n"
                + "                \n"
                + "            ],\n"
                + "            \"pId\": 0,\n"
                + "            \"parmKey\": \"name\",\n"
                + "            \"parmLibId\": 10,\n"
                + "            \"parmType\": \"string\",\n"
                + "            \"vId\": 1\n"
                + "        },\n"
                + "        {\n"
                + "            \"childNodeList\": [\n"
                + "                {\n"
                + "                    \"childNodeList\": [\n"
                + "                        {\n"
                + "                            \"childNodeList\": [\n"
                + "                                \n"
                + "                            ],\n"
                + "                            \"pId\": 3,\n"
                + "                            \"parmGroup\": 0,\n"
                + "                            \"parmKey\": \"name\",\n"
                + "                            \"parmLibId\": 2011,\n"
                + "                            \"parmType\": \"string\",\n"
                + "                            \"vId\": 4\n"
                + "                        },\n"
                + "                        {\n"
                + "                            \"childNodeList\": [\n"
                + "                                \n"
                + "                            ],\n"
                + "                            \"pId\": 3,\n"
                + "                            \"parmGroup\": 0,\n"
                + "                            \"parmKey\": \"value\",\n"
                + "                            \"parmLibId\": 2012,\n"
                + "                            \"parmType\": \"string\",\n"
                + "                            \"vId\": 5\n"
                + "                        },\n"
                + "                        {\n"
                + "                            \"childNodeList\": [\n"
                + "                                \n"
                + "                            ],\n"
                + "                            \"pId\": 3,\n"
                + "                            \"parmGroup\": 1,\n"
                + "                            \"parmKey\": \"name\",\n"
                + "                            \"parmLibId\": 2011,\n"
                + "                            \"parmType\": \"string\",\n"
                + "                            \"vId\": 6\n"
                + "                        },\n"
                + "                        {\n"
                + "                            \"childNodeList\": [\n"
                + "                                \n"
                + "                            ],\n"
                + "                            \"pId\": 3,\n"
                + "                            \"parmGroup\": 1,\n"
                + "                            \"parmKey\": \"value\",\n"
                + "                            \"parmLibId\": 2012,\n"
                + "                            \"parmType\": \"string\",\n"
                + "                            \"vId\": 7\n"
                + "                        },\n"
                + "                        {\n"
                + "                            \"childNodeList\": [\n"
                + "                                \n"
                + "                            ],\n"
                + "                            \"pId\": 3,\n"
                + "                            \"parmGroup\": 2,\n"
                + "                            \"parmKey\": \"name\",\n"
                + "                            \"parmLibId\": 2011,\n"
                + "                            \"parmType\": \"string\",\n"
                + "                            \"vId\": 8\n"
                + "                        },\n"
                + "                        {\n"
                + "                            \"childNodeList\": [\n"
                + "                                \n"
                + "                            ],\n"
                + "                            \"pId\": 3,\n"
                + "                            \"parmGroup\": 2,\n"
                + "                            \"parmKey\": \"value\",\n"
                + "                            \"parmLibId\": 2012,\n"
                + "                            \"parmType\": \"string\",\n"
                + "                            \"vId\": 9\n"
                + "                        },\n"
                + "                        {\n"
                + "                            \"childNodeList\": [\n"
                + "                                \n"
                + "                            ],\n"
                + "                            \"pId\": 3,\n"
                + "                            \"parmGroup\": 3,\n"
                + "                            \"parmKey\": \"name\",\n"
                + "                            \"parmLibId\": 2011,\n"
                + "                            \"parmType\": \"string\",\n"
                + "                            \"vId\": 10\n"
                + "                        },\n"
                + "                        {\n"
                + "                            \"childNodeList\": [\n"
                + "                                \n"
                + "                            ],\n"
                + "                            \"pId\": 3,\n"
                + "                            \"parmGroup\": 3,\n"
                + "                            \"parmKey\": \"value\",\n"
                + "                            \"parmLibId\": 2012,\n"
                + "                            \"parmType\": \"string\",\n"
                + "                            \"vId\": 11\n"
                + "                        },\n"
                + "                        {\n"
                + "                            \"childNodeList\": [\n"
                + "                                \n"
                + "                            ],\n"
                + "                            \"pId\": 3,\n"
                + "                            \"parmGroup\": 4,\n"
                + "                            \"parmKey\": \"name\",\n"
                + "                            \"parmLibId\": 2011,\n"
                + "                            \"parmType\": \"string\",\n"
                + "                            \"vId\": 12\n"
                + "                        },\n"
                + "                        {\n"
                + "                            \"childNodeList\": [\n"
                + "                                \n"
                + "                            ],\n"
                + "                            \"pId\": 3,\n"
                + "                            \"parmGroup\": 4,\n"
                + "                            \"parmKey\": \"value\",\n"
                + "                            \"parmLibId\": 2012,\n"
                + "                            \"parmType\": \"string\",\n"
                + "                            \"vId\": 13\n"
                + "                        }\n"
                + "                    ],\n"
                + "                    \"pId\": 2,\n"
                + "                    \"parmKey\": \"parameters\",\n"
                + "                    \"parmLibId\": 201,\n"
                + "                    \"parmType\": \"[object]\",\n"
                + "                    \"vId\": 3\n"
                + "                }\n"
                + "            ],\n"
                + "            \"pId\": 0,\n"
                + "            \"parmKey\": \"inputs\",\n"
                + "            \"parmLibId\": 20,\n"
                + "            \"parmType\": \"object\",\n"
                + "            \"vId\": 2\n"
                + "        },\n"
                + "        {\n"
                + "            \"childNodeList\": [\n"
                + "                {\n"
                + "                    \"childNodeList\": [\n"
                + "                        \n"
                + "                    ],\n"
                + "                    \"pId\": 14,\n"
                + "                    \"parmKey\": \"image\",\n"
                + "                    \"parmLibId\": 501,\n"
                + "                    \"parmType\": \"string\",\n"
                + "                    \"vId\": 15\n"
                + "                },\n"
                + "                {\n"
                + "                    \"childNodeList\": [\n"
                + "                        \n"
                + "                    ],\n"
                + "                    \"pId\": 14,\n"
                + "                    \"parmKey\": \"imagePullPolicy\",\n"
                + "                    \"parmLibId\": 502,\n"
                + "                    \"parmType\": \"string\",\n"
                + "                    \"vId\": 16\n"
                + "                },\n"
                + "                {\n"
                + "                    \"childNodeList\": [\n"
                + "                        \n"
                + "                    ],\n"
                + "                    \"pId\": 14,\n"
                + "                    \"parmKey\": \"command\",\n"
                + "                    \"parmLibId\": 503,\n"
                + "                    \"parmType\": \"[string]\",\n"
                + "                    \"vId\": 17\n"
                + "                },\n"
                + "                {\n"
                + "                    \"childNodeList\": [\n"
                + "                        \n"
                + "                    ],\n"
                + "                    \"pId\": 14,\n"
                + "                    \"parmKey\": \"source\",\n"
                + "                    \"parmLibId\": 504,\n"
                + "                    \"parmType\": \"string\",\n"
                + "                    \"vId\": 18\n"
                + "                }\n"
                + "            ],\n"
                + "            \"pId\": 0,\n"
                + "            \"parmKey\": \"script\",\n"
                + "            \"parmLibId\": 50,\n"
                + "            \"parmType\": \"object\",\n"
                + "            \"vId\": 14\n"
                + "        },\n"
                + "        {\n"
                + "            \"childNodeList\": [\n"
                + "                {\n"
                + "                    \"childNodeList\": [\n"
                + "                        {\n"
                + "                            \"childNodeList\": [\n"
                + "                                \n"
                + "                            ],\n"
                + "                            \"pId\": 20,\n"
                + "                            \"parmKey\": \"name\",\n"
                + "                            \"parmLibId\": 4011,\n"
                + "                            \"parmType\": \"string\",\n"
                + "                            \"vId\": 21\n"
                + "                        },\n"
                + "                        {\n"
                + "                            \"childNodeList\": [\n"
                + "                                \n"
                + "                            ],\n"
                + "                            \"pId\": 20,\n"
                + "                            \"parmKey\": \"path\",\n"
                + "                            \"parmLibId\": 4012,\n"
                + "                            \"parmType\": \"string\",\n"
                + "                            \"vId\": 22\n"
                + "                        },\n"
                + "                        {\n"
                + "                            \"childNodeList\": [\n"
                + "                                {\n"
                + "                                    \"childNodeList\": [\n"
                + "                                        \n"
                + "                                    ],\n"
                + "                                    \"pId\": 23,\n"
                + "                                    \"parmKey\": \"endpoint\",\n"
                + "                                    \"parmLibId\": 40131,\n"
                + "                                    \"parmType\": \"string\",\n"
                + "                                    \"parmValue\": \"192.9.99.91:9000\",\n"
                + "                                    \"vId\": 24\n"
                + "                                },\n"
                + "                                {\n"
                + "                                    \"childNodeList\": [\n"
                + "                                        \n"
                + "                                    ],\n"
                + "                                    \"pId\": 23,\n"
                + "                                    \"parmKey\": \"insecure\",\n"
                + "                                    \"parmLibId\": 40132,\n"
                + "                                    \"parmType\": \"string\",\n"
                + "                                    \"parmValue\": \"Y\",\n"
                + "                                    \"vId\": 25\n"
                + "                                },\n"
                + "                                {\n"
                + "                                    \"childNodeList\": [\n"
                + "                                        \n"
                + "                                    ],\n"
                + "                                    \"pId\": 23,\n"
                + "                                    \"parmKey\": \"bucket\",\n"
                + "                                    \"parmLibId\": 40133,\n"
                + "                                    \"parmType\": \"string\",\n"
                + "                                    \"parmValue\": \"argo-test\",\n"
                + "                                    \"vId\": 26\n"
                + "                                },\n"
                + "                                {\n"
                + "                                    \"childNodeList\": [\n"
                + "                                        \n"
                + "                                    ],\n"
                + "                                    \"pId\": 23,\n"
                + "                                    \"parmKey\": \"key\",\n"
                + "                                    \"parmLibId\": 40134,\n"
                + "                                    \"parmType\": \"string\",\n"
                + "                                    \"vId\": 27\n"
                + "                                },\n"
                + "                                {\n"
                + "                                    \"childNodeList\": [\n"
                + "                                        {\n"
                + "                                            \"childNodeList\": [\n"
                + "                                                \n"
                + "                                            ],\n"
                + "                                            \"pId\": 28,\n"
                + "                                            \"parmKey\": \"name\",\n"
                + "                                            \"parmLibId\": 401351,\n"
                + "                                            \"parmType\": \"string\",\n"
                + "                                            \"parmValue\": \"my-s3-credentials\",\n"
                + "                                            \"vId\": 29\n"
                + "                                        },\n"
                + "                                        {\n"
                + "                                            \"childNodeList\": [\n"
                + "                                                \n"
                + "                                            ],\n"
                + "                                            \"pId\": 28,\n"
                + "                                            \"parmKey\": \"key\",\n"
                + "                                            \"parmLibId\": 401352,\n"
                + "                                            \"parmType\": \"string\",\n"
                + "                                            \"parmValue\": \"accessKey\",\n"
                + "                                            \"vId\": 30\n"
                + "                                        }\n"
                + "                                    ],\n"
                + "                                    \"pId\": 23,\n"
                + "                                    \"parmKey\": \"accessKeySecret\",\n"
                + "                                    \"parmLibId\": 40135,\n"
                + "                                    \"parmType\": \"object\",\n"
                + "                                    \"vId\": 28\n"
                + "                                },\n"
                + "                                {\n"
                + "                                    \"childNodeList\": [\n"
                + "                                        {\n"
                + "                                            \"childNodeList\": [\n"
                + "                                                \n"
                + "                                            ],\n"
                + "                                            \"pId\": 31,\n"
                + "                                            \"parmKey\": \"name\",\n"
                + "                                            \"parmLibId\": 401361,\n"
                + "                                            \"parmType\": \"string\",\n"
                + "                                            \"parmValue\": \"my-s3-credentials\",\n"
                + "                                            \"vId\": 32\n"
                + "                                        },\n"
                + "                                        {\n"
                + "                                            \"childNodeList\": [\n"
                + "                                                \n"
                + "                                            ],\n"
                + "                                            \"pId\": 31,\n"
                + "                                            \"parmKey\": \"key\",\n"
                + "                                            \"parmLibId\": 401362,\n"
                + "                                            \"parmType\": \"string\",\n"
                + "                                            \"parmValue\": \"secretKey\",\n"
                + "                                            \"vId\": 33\n"
                + "                                        }\n"
                + "                                    ],\n"
                + "                                    \"pId\": 23,\n"
                + "                                    \"parmKey\": \"secretKeySecret\",\n"
                + "                                    \"parmLibId\": 40136,\n"
                + "                                    \"parmType\": \"object\",\n"
                + "                                    \"vId\": 31\n"
                + "                                }\n"
                + "                            ],\n"
                + "                            \"pId\": 20,\n"
                + "                            \"parmKey\": \"s3\",\n"
                + "                            \"parmLibId\": 4013,\n"
                + "                            \"parmType\": \"object\",\n"
                + "                            \"vId\": 23\n"
                + "                        }\n"
                + "                    ],\n"
                + "                    \"pId\": 19,\n"
                + "                    \"parmKey\": \"artifacts\",\n"
                + "                    \"parmLibId\": 401,\n"
                + "                    \"parmType\": \"[object]\",\n"
                + "                    \"vId\": 20\n"
                + "                },\n"
                + "                {\n"
                + "                    \"childNodeList\": [\n"
                + "                        {\n"
                + "                            \"childNodeList\": [\n"
                + "                                \n"
                + "                            ],\n"
                + "                            \"pId\": 34,\n"
                + "                            \"parmKey\": \"name\",\n"
                + "                            \"parmLibId\": 4021,\n"
                + "                            \"parmType\": \"string\",\n"
                + "                            \"vId\": 35\n"
                + "                        },\n"
                + "                        {\n"
                + "                            \"childNodeList\": [\n"
                + "                                {\n"
                + "                                    \"childNodeList\": [\n"
                + "                                        \n"
                + "                                    ],\n"
                + "                                    \"pId\": 36,\n"
                + "                                    \"parmKey\": \"path\",\n"
                + "                                    \"parmLibId\": 40222,\n"
                + "                                    \"parmType\": \"string\",\n"
                + "                                    \"vId\": 37\n"
                + "                                }\n"
                + "                            ],\n"
                + "                            \"pId\": 34,\n"
                + "                            \"parmKey\": \"valueFrom\",\n"
                + "                            \"parmLibId\": 4022,\n"
                + "                            \"parmType\": \"object\",\n"
                + "                            \"vId\": 36\n"
                + "                        },\n"
                + "                        {\n"
                + "                            \"childNodeList\": [\n"
                + "                                \n"
                + "                            ],\n"
                + "                            \"pId\": 34,\n"
                + "                            \"parmKey\": \"globalName\",\n"
                + "                            \"parmLibId\": 4023,\n"
                + "                            \"parmType\": \"string\",\n"
                + "                            \"vId\": 38\n"
                + "                        }\n"
                + "                    ],\n"
                + "                    \"pId\": 19,\n"
                + "                    \"parmKey\": \"parameters\",\n"
                + "                    \"parmLibId\": 402,\n"
                + "                    \"parmType\": \"[object]\",\n"
                + "                    \"vId\": 34\n"
                + "                }\n"
                + "            ],\n"
                + "            \"pId\": 0,\n"
                + "            \"parmKey\": \"outputs\",\n"
                + "            \"parmLibId\": 40,\n"
                + "            \"parmType\": \"object\",\n"
                + "            \"vId\": 19\n"
                + "        }\n"
                + "    ],\n"
                + "    \"pId\": -1,\n"
                + "    \"parmKey\": \"template\",\n"
                + "    \"parmLibId\": 0,\n"
                + "    \"parmType\": \"object\",\n"
                + "    \"vId\": 0\n"
                + "}";


        TaskParmKVDTO taskParmKVDTO = JSONUtil.toBean(str, TaskParmKVDTO.class);

        System.out.println(taskParmKVDTO);


        System.out.println("---");
        System.out.println(getMap(taskParmKVDTO));
        System.out.println("---");
        System.out.println(JSONUtil.toJsonStr(getMap(taskParmKVDTO)));


    }

    public static Map<String, Map> getMap(TaskParmKVDTO taskParmKVDTO){

        if (null == taskParmKVDTO){
            return null;

        }

        Map<String, Map> map = new HashMap<>();

        map.put(taskParmKVDTO.getParmKey(),getMap(taskParmKVDTO.getChildNodeList()));

        return map;


    }

    public  static Map<String, Map> getMap(List<TaskParmKVDTO> taskParmKVDTO){

        if (null == taskParmKVDTO){
            return null;

        }

        Map<String, Map> map = new HashMap<>();


        for (TaskParmKVDTO parmKVDTO : taskParmKVDTO) {


            map.put(parmKVDTO.getParmKey(),getMap(parmKVDTO.getChildNodeList()));

        }

        return map;


    }


    public  static Map<String, Map> getMap(List<TaskParmKVDTO> taskParmKVDTO){

        if (null == taskParmKVDTO){
            return null;

        }

        Map<String, Map> map = new HashMap<>();


        for (TaskParmKVDTO parmKVDTO : taskParmKVDTO) {


            map.put(parmKVDTO.getParmKey(),getMap(parmKVDTO.getChildNodeList()));

        }

        return map;


    }
}

@Data
class TaskParmKVDTO {
    private Long parmLibId;//略
    private Long vId; //自身的id
    private Long pId; //父id
    private String parmKey;//map存的key
    private String parmValue;//map存的value，（如果有的话，没有可能是个对象或数组对象，也有可能是个叶子节点）
    private String parmType;//当前参数的类型，有四种：对象、对象数组、字符串、字符串数组
    private Integer parmGroup;//value为字符串类型的话，这个代表哪个k,v是一组

    // 孩子node list
    private List<TaskParmKVDTO> childNodeList = new ArrayList<>();
}