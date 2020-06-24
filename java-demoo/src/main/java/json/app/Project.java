package json.app;

import lombok.Data;

/**
 * @author CBeann
 * @create 2020-06-18 19:08
 */
@Data
public class Project {


    private int id;
    private String name;
    private String description;
    private String web_url;
    private String avatar_url;
    private String git_ssh_url;
    private String git_http_url;
    private String namespace;
    private int visibility_level;
    private String path_with_namespace;
    private String default_branch;
    private String ci_config_path;
    private String homepage;
    private String url;
    private String ssh_url;
    private String http_url;
}
