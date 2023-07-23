package com.jpasample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpasample.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{
    // JpaRepository を継承することでデータ検索が簡単に行える。
    // public interface 名前 extends JpaRepository <エンティティ , IDタイプ>　←こんな感じで書く
    // 注意：IDタイプにはラッパークラスを指定する。

    // 主キーのIDの昇順にする。
    List<Item> findAllByOrderByIdAsc();
}
