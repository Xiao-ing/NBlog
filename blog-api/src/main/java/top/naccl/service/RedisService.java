package top.naccl.service;

import top.naccl.model.vo.BlogInfo;
import top.naccl.model.vo.PageResult;

import java.util.List;
import java.util.Map;

public interface RedisService {
	PageResult<BlogInfo> getBlogInfoPageResultByHash(String hash, Integer pageNum);

	void saveBlogInfoPageResultToHash(String hash, Integer pageNum, Object object);

	void saveMapToHash(String hash, Map map);

	Object getValueByHashKey(String hash, Object key);

	void incrementByHashKey(String hash, Object key, int increment);

	<T> List<T> getListByValue(String key);

	<T> void saveListToValue(String key, List<T> list);

	<T> Map<String, T> getMapByValue(String key);

	<T> void saveMapToValue(String key, Map<String, T> map);

	<T> T getObjectByValue(String key, Class t);

	void saveObjectToValue(String key, Object object);

	void deleteCacheByKey(String key);

	boolean hasKey(String key);
}