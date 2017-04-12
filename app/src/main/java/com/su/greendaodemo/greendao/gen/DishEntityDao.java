package com.su.greendaodemo.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.su.chinaso.suchef.dish.DishEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DISH_ENTITY".
*/
public class DishEntityDao extends AbstractDao<DishEntity, Void> {

    public static final String TABLENAME = "DISH_ENTITY";

    /**
     * Properties of entity DishEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, int.class, "id", false, "ID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Price = new Property(2, String.class, "price", false, "PRICE");
        public final static Property ImgPath = new Property(3, String.class, "imgPath", false, "IMG_PATH");
        public final static Property MajorIngredient = new Property(4, String.class, "majorIngredient", false, "MAJOR_INGREDIENT");
    };


    public DishEntityDao(DaoConfig config) {
        super(config);
    }
    
    public DishEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DISH_ENTITY\" (" + //
                "\"ID\" INTEGER NOT NULL ," + // 0: id
                "\"NAME\" TEXT NOT NULL ," + // 1: name
                "\"PRICE\" TEXT NOT NULL ," + // 2: price
                "\"IMG_PATH\" TEXT NOT NULL ," + // 3: imgPath
                "\"MAJOR_INGREDIENT\" TEXT);"); // 4: majorIngredient
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DISH_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DishEntity entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
        stmt.bindString(2, entity.getName());
        stmt.bindString(3, entity.getPrice());
        stmt.bindString(4, entity.getImgPath());
 
        String majorIngredient = entity.getMajorIngredient();
        if (majorIngredient != null) {
            stmt.bindString(5, majorIngredient);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DishEntity entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
        stmt.bindString(2, entity.getName());
        stmt.bindString(3, entity.getPrice());
        stmt.bindString(4, entity.getImgPath());
 
        String majorIngredient = entity.getMajorIngredient();
        if (majorIngredient != null) {
            stmt.bindString(5, majorIngredient);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public DishEntity readEntity(Cursor cursor, int offset) {
        DishEntity entity = new DishEntity( //
            cursor.getInt(offset + 0), // id
            cursor.getString(offset + 1), // name
            cursor.getString(offset + 2), // price
            cursor.getString(offset + 3), // imgPath
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // majorIngredient
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DishEntity entity, int offset) {
        entity.setId(cursor.getInt(offset + 0));
        entity.setName(cursor.getString(offset + 1));
        entity.setPrice(cursor.getString(offset + 2));
        entity.setImgPath(cursor.getString(offset + 3));
        entity.setMajorIngredient(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(DishEntity entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(DishEntity entity) {
        return null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}