   # 使用官方的 Filebeat 镜像作为基础镜像
FROM docker.elastic.co/beats/filebeat:7.17.0

   # 复制自定义的 filebeat.yml 配置文件到容器中
COPY filebeat.yml /usr/share/filebeat/filebeat.yml

   # 设置文件权限
USER root
RUN chown root:filebeat /usr/share/filebeat/filebeat.yml

   # 切换到 filebeat 用户
USER filebeat

   # 启动 Filebeat
CMD ["filebeat", "-e", "-c", "/usr/share/filebeat/filebeat.yml"]