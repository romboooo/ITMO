import yaml
import json
import time

start_time = time.perf_counter()

with open('labainfa4.txt', 'r') as json_file:
    with open('ymldop.txt', 'w') as yaml_file:
        json_data = json.loads(json_file.read())
        converted_json_data = json.dump(json_data, yaml_file, ensure_ascii=False)

        yaml_data = yaml.safe_load(converted_json_data)
        converted_yaml_data = yaml.dump(yaml_data)

        yaml_file.write(converted_yaml_data)

print(time.perf_counter() - start_time)        